import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AdressBookTest {

    HashMap test = new HashMap();
    AdressBook testData = new AdressBook(test);

    @Test
    void add() {
        testData.add("Temik", "1,1,1");

    }

    @Test
    void delete() {
        testData.add("Temik", "1,1,1");
        testData.add("Dmitry","1,1,1");
    }

    @Test
    void newAdress() {
    }

    @Test
    void getAdress() {
    }

    @Test
    void peopleOnStreet() {
        testData.add("Dmitry","1,1,1");
        testData.add("Temik","1,2,1");
        testData.add("Geka", "2,3,6");
        assertEquals("Dmitry Temik ", testData.peopleOnStreet("1"));
    }

    @Test
    void peopleInHouse() {
        testData.add("Dmitry","1,1,1");
        testData.add("Temik","1,2,1");
        testData.add("Geka", "2,3,6");
        assertEquals("Dmitry Temik ", testData.peopleOnStreet("1"));
    }
}