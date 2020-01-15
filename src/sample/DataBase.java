package sample;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    private static final String connectionString = "jdbc:sqlserver://localhost:1433;databaseName=MagazinTablete;integratedSecurity=true;";
    private static DataBase instance = null;
    private static Connection conection = null;

    private DataBase() {

        try {
            conection = DriverManager.getConnection(connectionString);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DataBase getInstance() {
        if (instance == null)
            return new DataBase();
        else
            return instance;
    }

    private static int getNumberOfColumns(ResultSet set) throws SQLException {
        ResultSetMetaData rsmd = set.getMetaData();
        return rsmd.getColumnCount();
    }

    public static void update(RezultatQueryGreu b) {
        try {
            Statement statement = conection.createStatement();
            System.out.println("update [User] set " + b + " where  User_ID = '" + b.getId() + "';");
            statement.executeUpdate("update [Model Tableta] set " + b.update() + " where Model_ID  = '" + b.getId() + "';");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void loadDataIn(ArrayList<RezultatQueryGreu> data) {
        if(!data.isEmpty())
            return;
            try{
            ArrayList<String> attributes = new ArrayList<>();
            Statement statement = conection.createStatement();
            String SQLcommand = "select MT.Model_ID,P.[Nume Producator],T.[Nume Tableta]" +
                    ",MT.[Nume Model],MT.Pret from Producator P join Tableta T " +
                    "on P.Producator_ID = T.Producator_ID join [Model Tableta] MT" +
                    " on T.Tableta_ID = MT.Tableta_ID where MT.Model_ID in (select " +
                    "top  2 MTs.Model_ID from [Model Tableta] MTs order by MTs.Pret asc);";
            ResultSet results = statement.executeQuery(SQLcommand);
            int columnsNumber = getNumberOfColumns(results);
            while(results.next()){
                for (int i = 1; i <= columnsNumber; i++)
                    attributes.add(results.getString(i));
                data.add(new RezultatQueryGreu(attributes.toArray(String[]::new)));
                attributes.clear();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
