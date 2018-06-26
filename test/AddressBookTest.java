import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest {

    private HashMap<String, Address> test = new HashMap<>();
    private AddressBook testData = new AddressBook(test);
    private HashMap<String, Address> answer = new HashMap<>();

    @Test
    void add() {
        Address temp = new Address("1,1,1");
        answer.put("Temik", temp);
        assertEquals(answer, testData.add("Temik", "1,1,1"));
    }

    @Test
    void delete() {
        Address temp = new Address("1,1,1");
        answer.put("Temik", temp);
        testData.add("Temik", "1,1,1");
        testData.add("Dmitry", "1,1,1");
        assertEquals(answer, testData.delete("Dmitry"));
    }

    @Test
    void newAddress() {
        Address temp = new Address("2,2,2");
        answer.put("Temik", temp);
        testData.add("Temik", "1,1,1");
        assertEquals(answer, testData.newAddress("Temik", "2,2,2"));

    }

    @Test
    void getAddress() {
        Address temp = new Address("2,2,2");
        answer.put("Temik", temp);
        testData.add("Temik", "2,2,2");
        assertEquals(answer.get("Temik"), testData.getAddress("Temik"));

    }

    @Test
    void peopleOnStreet() {
        ArrayList<String> correct = new ArrayList<>();
        correct.add("Temik");
        correct.add("Geka");
        testData.add("Temik", "qwerty,14,56");
        testData.add("Geka", "qwerty,13,46");
        assertEquals(correct, testData.peopleOnStreet("qwerty"));
    }

    @Test
    void peopleInHouse() {
        ArrayList<String> correct = new ArrayList<>();
        correct.add("Temik");
        correct.add("Geka");
        testData.add("Temik", "qwerty,15,56");
        testData.add("Geka", "qwerty,15,46");
        testData.add("Dmitry", "qwerty,13,68");
        assertEquals(correct, testData.peopleInHouse("qwerty", "15"));
    }
}