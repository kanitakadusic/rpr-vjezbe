package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Information {
    private final ArrayList<String> infos;

    public Information(ArrayList<Object> infos) {
        this.infos = new ArrayList<>();

        for (Object o : infos) {
            if (o instanceof Printable) {
                this.infos.add(((Printable) o).getInfo());
            }
        }
    }

    public ArrayList<String> getInfos() {
        return infos;
    }
}
