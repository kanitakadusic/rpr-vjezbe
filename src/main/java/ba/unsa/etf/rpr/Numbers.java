package ba.unsa.etf.rpr;

public class Numbers {
    public static int sumOfDigits(int number) {
        if (number == 0) return 0;
        return number % 10 + sumOfDigits(number / 10);
    }

    public static boolean isDividableBySumOfDigits(int number) {
        return number % sumOfDigits(number) == 0;
    }
}
