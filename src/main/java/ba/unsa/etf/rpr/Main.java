package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        for (int i = 1; i <= integer; i++)
            if (Numbers.isDividableBySumOfDigits(i))
                System.out.printf("%d ", i);
    }
}