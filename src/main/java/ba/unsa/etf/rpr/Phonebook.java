package ba.unsa.etf.rpr;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.lang.StringBuilder;

public class Phonebook {
    HashMap<PhoneNumber, String> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void add(String name, PhoneNumber phoneNumber) {
        this.phonebook.put(phoneNumber, name);
    }

    public String getPhoneNumber(String name) {
        for (Map.Entry<PhoneNumber, String> set : this.phonebook.entrySet())
            if (name.equals(set.getValue()))
                return set.getKey().toString();

        return null;
    }

    public String getName(PhoneNumber phoneNumber) {
        return this.phonebook.get(phoneNumber);
    }

    public String onLetter(char letter) {
        StringBuilder info = new StringBuilder();

        for (Map.Entry<PhoneNumber, String> set : this.phonebook.entrySet())
            if (set.getValue().charAt(0) == letter)
                info.append(set.getValue()).append(" [").append(set.getKey()).append("]\n");

        if (info.isEmpty()) return null;
        return info.toString();
    }

    public Set<String> getNamesFromCity(City city) {
        Set<String> set = new TreeSet<>();

        this.phonebook.forEach((phoneNumber, name) -> {
            if (phoneNumber instanceof LocalPhoneNumber && ((LocalPhoneNumber) phoneNumber).getCity().equals(city))
                set.add(name);
        });

        if (set.isEmpty()) return null;
        return set;
    }

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
