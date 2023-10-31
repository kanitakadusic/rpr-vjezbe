package ba.unsa.etf.rpr;

@SuppressWarnings("SpellCheckingInspection")
public enum City {
    BIHAC("037"),
    ORASJE("031"),
    TUZLA("035"),
    ZENICA("032"),
    GORAZDE("038"),
    TRAVNIK("030"),
    MOSTAR("036"),
    SIROKI_BRIJEG("039"),
    SARAJEVO("033"),
    LIVNO("034");

    public final String label;

    City(String label) {
        this.label = label;
    }
}
