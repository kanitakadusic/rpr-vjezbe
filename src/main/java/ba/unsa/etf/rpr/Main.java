package ba.unsa.etf.rpr;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> nums = new ArrayList<>();

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
    }
}