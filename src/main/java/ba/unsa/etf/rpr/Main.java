package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics nums = new Statistics();
        String input;

        while (!(input = scanner.nextLine()).equals("stop")) {
            try {
                nums.add(Double.parseDouble(input));
            } catch (NumberFormatException e) {
                System.out.print("re-enter: ");
            }
        }

        System.out.println(nums.min());
        System.out.println(nums.max());
        System.out.println(nums.mean());
        System.out.println(nums.standardDeviation());
    }
}