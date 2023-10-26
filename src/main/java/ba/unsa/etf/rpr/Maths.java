package ba.unsa.etf.rpr;

public class Maths {
    public static double sin(double x) {
        return java.lang.Math.sin(x);
    }

    public static int fact(int x) {
        if (x <= 1) return 1;
        return x * fact(x - 1);
    }
}
