package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics nums = new Statistics();

        for (;;) {
            System.out.print("enter number: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) break;

            try {
                nums.add(Double.parseDouble(input));
            } catch (NumberFormatException e) {
                System.out.print(" > re-");
            }
        }

        System.out.println(nums.min());
        System.out.println(nums.max());
        System.out.println(nums.mean());
        System.out.println(nums.standardDeviation());
    }
}