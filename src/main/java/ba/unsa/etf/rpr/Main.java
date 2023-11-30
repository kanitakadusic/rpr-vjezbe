package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> fullNames = new ArrayList<>();
        fullNames.add("Yellow Banana");
        fullNames.add("Green Kiwi");

        FullName fullName = new FullName(fullNames);

        ArrayList<String> names = new ArrayList<>();
        names.add("Red");
        names.add("Orange");

        ArrayList<String> surnames = new ArrayList<>();
        surnames.add("Strawberry");
        surnames.add("Orange");;

        NameSurname nameSurname = new NameSurname(names, surnames);

        Winner first = new Winner(fullName);
        System.out.println(first.getName() + first.getSurname());

        Winner second = new Winner(nameSurname);
        System.out.println(second.getName() + second.getSurname());
    }
}