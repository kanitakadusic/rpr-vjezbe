package ba.unsa.etf.rpr;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();
        String choice = "";

        System.out.println("Welcome!");

        while (!choice.equals("end")) {
            System.out.print("""
                    
                    [1] add contact
                    [2] get phone number
                    [3] get name
                    [4] get list of numbers for names on letter
                    [5] get phone numbers from city
                    [6] get names from city
                    """);

            System.out.print("=> ");
            choice = input.nextLine();

            switch (choice) {
                case "1": {
                    System.out.print("""
                                [A] local phone number
                                [B] mobile phone number
                                [C] international phone number
                            """);

                    System.out.print("    => ");
                    choice = input.nextLine();

                    System.out.print("        name: ");
                    String name = input.nextLine();

                    System.out.print("        phone number: ");
                    String number = input.nextLine(), info;

                    switch (choice) {
                        case "A": {
                            System.out.print("        area: ");
                            info = input.nextLine();

                            phonebook.add(name, new LocalPhoneNumber(City.values()[Integer.parseInt(info) - 1], number));
                            break;
                        }

                        case "B": {
                            System.out.print("        network number: ");
                            info = input.nextLine();

                            phonebook.add(name, new MobilePhoneNumber(Integer.parseInt(info), number));
                            break;
                        }

                        case "C": {
                            System.out.print("        state number: ");
                            info = input.nextLine();

                            phonebook.add(name, new InternationalPhoneNumber(info, number));
                            break;
                        }
                    }

                    System.out.println("\nContact added successfully!");
                    break;
                }

                case "2": {
                    System.out.print("    name: ");
                    String info = input.nextLine();

                    System.out.print("\nResult: ");
                    System.out.println(Objects.requireNonNullElse(phonebook.getPhoneNumber(info), "No match found."));
                    break;
                }

                case "3": {
                    System.out.print("""
                                [A] local phone number
                                [B] mobile phone number
                                [C] international phone number
                            """);

                    System.out.print("    => ");
                    choice = input.nextLine();

                    System.out.print("        phone number: ");
                    String number = input.nextLine(), info = null;

                    switch (choice) {
                        case "A": {
                            System.out.print("        area: ");
                            info = input.nextLine();

                            info = phonebook.getName(new LocalPhoneNumber(City.values()[Integer.parseInt(info) - 1], number));
                            break;
                        }

                        case "B": {
                            System.out.print("        network number: ");
                            info = input.nextLine();

                            info = phonebook.getName(new MobilePhoneNumber(Integer.parseInt(info), number));
                            break;
                        }

                        case "C": {
                            System.out.print("        state number: ");
                            info = input.nextLine();

                            info = phonebook.getName(new InternationalPhoneNumber(info, number));
                            break;
                        }
                    }

                    System.out.print("\nResult: ");
                    System.out.println(Objects.requireNonNullElse(info, "No match found."));
                    break;
                }

                case "4": {
                    System.out.print("    letter: ");
                    choice = input.nextLine();

                    System.out.print("\nResult: ");
                    System.out.print(Objects.requireNonNullElse(phonebook.onLetter(choice.charAt(0)), "No match found.\n"));
                    break;
                }

                case "5": {
                    System.out.print("    area: ");
                    choice = input.nextLine();

                    System.out.print("\nResult: ");
                    System.out.println(Objects.requireNonNullElse(phonebook.getPhoneNumbersFromCity(City.values()[Integer.parseInt(choice) - 1]), "No match found."));
                    break;
                }

                case "6": {
                    System.out.print("    area: ");
                    choice = input.nextLine();

                    System.out.print("\nResult: ");
                    System.out.println(Objects.requireNonNullElse(phonebook.getNamesFromCity(City.values()[Integer.parseInt(choice) - 1]), "No match found."));
                    break;
                }
            }
        }
    }
}