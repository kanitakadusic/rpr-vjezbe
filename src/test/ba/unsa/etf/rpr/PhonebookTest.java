package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {

    @Test
    void add() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));
        assertEquals(1, phonebook.size());
    }

    @Test
    void getPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));
        assertEquals("010/123-456", phonebook.getPhoneNumber("Name"));
    }

    @Test
    void getPhoneNumberNoMatch() {
        Phonebook phonebook = new Phonebook();
        assertNull(phonebook.getPhoneNumber("Name"));
    }

    @Test
    void getName() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));
        assertEquals("Name", phonebook.getName(new MobilePhoneNumber(10, "123-456")));
    }

    @Test
    void getNameNoMatch() {
        Phonebook phonebook = new Phonebook();
        assertNull(phonebook.getName(new MobilePhoneNumber(10, "123-456")));
    }

    @Test
    void onLetter() {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));

        try { assertEquals("Name [010/123-456]\n", phonebook.onLetter('N')); }
        catch (InvalidParametersException ignored) {}
    }

    @Test
    void onLetterNoMatch() {
        Phonebook phonebook = new Phonebook();

        try { assertNull(phonebook.onLetter('N')); }
        catch (InvalidParametersException ignored) {}
    }

    @Test
    void onLetterException() {
        Phonebook phonebook = new Phonebook();
        assertThrows(InvalidParametersException.class, () -> phonebook.onLetter('0'));
    }
}