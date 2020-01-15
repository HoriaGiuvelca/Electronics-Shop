package sample;

public class RezultatQueryGreu {
    private String id;
    private String brand;
    private String gama;
    private String model;
    private String pret;



    public RezultatQueryGreu() {
    }

    public RezultatQueryGreu(String[] args) {
        this(args[0], args[1], args[2], args[3],args[4]);
    }

    public RezultatQueryGreu(String id,String brand, String gama, String model, String pret) {
        this.id = id;
        this.brand = brand;
        this.gama = gama;
        this.model = model;
        this.pret = pret;
    }

    public String getPret() {
        return pret;
    }

    public void setPret(String pret) {
        this.pret = pret;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "";

    }

    public String update() {
        return "pret = "+pret;
    }
}
