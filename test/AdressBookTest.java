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
        //assertEquals(HashMap("Temik","1,1,1"), );

    }

    @Test
    void delete() {
        testData.add("Temik", "1,1,1");
        testData.add("Dmitry","1,1,1");
        //`assertEquals(HashMap("Dmitry","1,1,1"), testData.delete("Temik") );
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
        assertEquals("Dmitry Temik ", testData.peopleOnStreet("1"));
    }

    @Test
    void peopleInHouse() {
    }
}