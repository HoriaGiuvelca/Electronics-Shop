package sample;

import java.util.ArrayList;

public class RepositoryRezultate {
    private static RepositoryRezultate instance = null;
    private ArrayList<RezultatQueryGreu> data = null;

    private RepositoryRezultate() {
        data = new ArrayList<>();
    }

    public static RepositoryRezultate getInstance() {
        if (instance == null)
            return instance = new RepositoryRezultate();
        else return instance;
    }

    public void setInstance(RepositoryRezultate instance) {
        this.instance = instance;
    }

    public ArrayList<RezultatQueryGreu> getData() {
        return data;
    }

    public void setData(ArrayList<RezultatQueryGreu> data) {
        this.data = data;
    }
}
