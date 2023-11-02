package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.lang.StringBuilder;

/**
 * Collection of contacts
 */
public class Phonebook {
    HashMap<PhoneNumber, String> phonebook;

    /**
     * Default constructor
     */
    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    /**
     * Adds single contact to collection of contacts
     * @param name Contact name
     * @param phoneNumber Contact phone number
     */
    public void add(String name, PhoneNumber phoneNumber) {
        this.phonebook.put(phoneNumber, name);
    }

    /**
     * Returns phone number based on specified contact name
     * @param name Contact name
     * @return Contact phone number or null if there is no match
     */
    public String getPhoneNumber(String name) {
        for (Map.Entry<PhoneNumber, String> set : this.phonebook.entrySet())
            if (name.equals(set.getValue()))
                return set.getKey().toString();

        return null;
    }

    /**
     * Returns name based on specified contact phone number
     * @param phoneNumber Contact phone number
     * @return Contact name or null if there is no match
     */
    public String getName(PhoneNumber phoneNumber) {
        return this.phonebook.get(phoneNumber);
    }

    /**
     * Returns contacts whose name starts with specified letter
     * @param letter Desired letter
     * @return String of "/Name/ [/PhoneNumber/]" contacts or null if there is no match
     * @throws InvalidParametersException In case the character is not a letter
     */
    public String onLetter(char letter) throws InvalidParametersException {
        if (!Character.isLetter(letter)) throw new InvalidParametersException(letter + " is not a letter.");
        StringBuilder info = new StringBuilder();

        for (Map.Entry<PhoneNumber, String> set : this.phonebook.entrySet())
            if (set.getValue().charAt(0) == letter)
                info.append(set.getValue()).append(" [").append(set.getKey()).append("]\n");

        if (info.isEmpty()) return null;
        return info.toString();
    }

    /**
     * Returns names for contacts from specified city
     * @param city Desired city
     * @return Set of contact names or null if there is no match
     */
    public Set<String> getNamesFromCity(City city) {
        Set<String> set = new TreeSet<>();

        this.phonebook.forEach((phoneNumber, name) -> {
            if (phoneNumber instanceof LocalPhoneNumber && ((LocalPhoneNumber) phoneNumber).getCity().equals(city))
                set.add(name);
        });

        if (set.isEmpty()) return null;
        return set;
    }


    /**
     * Returns phone numbers for contacts from specified city
     * @param city Desired city
     * @return Set of contact phone numbers or null if there is no match
     */
    public Set<PhoneNumber> getPhoneNumbersFromCity(City city) {
        Set<PhoneNumber> set = new TreeSet<>(new PhoneNumberComparator());

        this.phonebook.forEach((phoneNumber, name) -> {
            if (phoneNumber instanceof LocalPhoneNumber && ((LocalPhoneNumber) phoneNumber).getCity().equals(city))
                set.add(phoneNumber);
        });

        if (set.isEmpty()) return null;
        return set;
    }
}
