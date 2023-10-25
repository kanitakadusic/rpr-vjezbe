package ba.unsa.etf.rpr;

public class Maths {
    private static double pow(double base, int exp) {
        double result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }

        return result;
    }

    public static double sin(double x) {
        /*
        double result = 0;

        for (int i = 0; i <= 5; i++) {
            result += Maths.pow(-1, i) * Maths.pow(x, 2 * i + 1) / Maths.fact(2 * i + 1);
        }
        */

        return java.lang.Math.sin(x);
    }

    public static int fact(int x) {
        if (x <= 1) return 1;
        return x * fact(x - 1);
    }
}
