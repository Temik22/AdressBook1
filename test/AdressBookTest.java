import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdressBookTest {

    HashMap test = new HashMap();
    AdressBook testData = new AdressBook(test);

    @Test
    void add() {
        HashMap answer = new HashMap();
        answer.put("Temik", "1,1,1");
        assertEquals(answer, testData.add("Temik", "1,1,1"));
    }

    @Test
    void delete() {
        HashMap answer = new HashMap();
        answer.put("Temik", "1,1,1");
        testData.add("Temik", "1,1,1");
        testData.add("Dmitry","1,1,1");
        assertEquals(answer, testData.delete("Dmitry"));
    }

    @Test
    void newAdress() {
        HashMap answer = new HashMap();
        answer.put("Temik", "2,2,2");
        testData.add("Temik", "1,1,1");
        assertEquals(answer,testData.newAdress("Temik", "2,2,2"));

    }

    @Test
    void getAdress() {
        HashMap answer = new HashMap();
        answer.put("Temik", "2,2,2");
        testData.add("Temik", "2,2,2");
        assertEquals(answer.get("Temik"), testData.getAdress("Temik"));

    }

    @Test
    void peopleOnStreet() {
        List answer = new ArrayList();
        answer.add("Dmitry");
        answer.add("Temik");
        testData.add("Dmitry","1,1,1");
        testData.add("Temik","1,2,1");
        testData.add("Geka", "2,3,6");
        assertEquals(answer, testData.peopleOnStreet("1"));
    }

    @Test
    void peopleInHouse() {
        List answer = new ArrayList();
        answer.add("Dmitry");
        answer.add("Temik");
        testData.add("Dmitry","1,1,1");
        testData.add("Temik","1,2,1");
        testData.add("Geka", "2,3,6");
        assertEquals(answer, testData.peopleOnStreet("1"));
    }
}