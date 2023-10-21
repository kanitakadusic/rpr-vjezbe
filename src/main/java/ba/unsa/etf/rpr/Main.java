package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers");
        int a = input.nextInt(), b = input.nextInt();

        System.out.printf("=> %d\n=> %d", a, b);
    }
}