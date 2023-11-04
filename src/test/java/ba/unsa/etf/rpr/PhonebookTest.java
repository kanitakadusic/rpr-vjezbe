package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;

class PhonebookTest {
    private Phonebook phonebook;

    @BeforeEach
    public void beforeEachTest() {
        this.phonebook = new Phonebook();
    }

    @Test
    public void add() {
        this.phonebook.add("Name", Mockito.mock(PhoneNumber.class));
        assertEquals(1, this.phonebook.size());
    }

    @Test
    public void getPhoneNumber() {
        this.phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));
        assertEquals("010/123-456", this.phonebook.getPhoneNumber("Name"));
    }

    @Test
    public void getPhoneNumberNoMatch() {
        assertNull(this.phonebook.getPhoneNumber("Name"));
    }

    @Test
    public void getName() {
        this.phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));
        assertEquals("Name", this.phonebook.getName(new MobilePhoneNumber(10, "123-456")));
    }

    @Test
    public void getNameNoMatch() {
        assertNull(this.phonebook.getName(new MobilePhoneNumber(10, "123-456")));
    }

    @Test
    public void onLetter() {
        this.phonebook.add("Name", new MobilePhoneNumber(10, "123-456"));

        try { assertEquals("Name [010/123-456]\n", this.phonebook.onLetter('N')); }
        catch (InvalidParametersException ignored) {}
    }

    @Test
    public void onLetterNoMatch() {
        try { assertNull(this.phonebook.onLetter('N')); }
        catch (InvalidParametersException ignored) {}
    }

    @Test
    public void onLetterException() {
        assertThrows(InvalidParametersException.class, () -> this.phonebook.onLetter('0'));
    }
}