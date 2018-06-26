import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class AddressBook {

    private HashMap<String, Address> book;

    public AddressBook(HashMap<String, Address> book) {
        this.book = book;
    }

    public HashMap add(String name, String address) {        //Adding new people in Book
        if (book.containsKey(name)) {
            throw new IllegalArgumentException("This name is already in book");
        } else {
            Address temp = new Address(address);
            book.put(name, temp);
        }
        return book;
    }

    public HashMap delete(String name) {            //Deleting people from Book
        book.remove(name);
        return book;
    }

    public HashMap newAddress(String name, String address) {          //Changing address for man
        if (book.containsKey(name)) {
            Address temp = new Address(address);
            book.put(name, temp);
        } else {
            throw new IllegalArgumentException("Invalid Name");
        }
        return book;
    }

    public String getAddress(String name) {              //Get address by man
        if (book.containsKey(name)) {
            return book.get(name).toString();
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public ArrayList<String> peopleOnStreet(String street) {               //Return List of all people that live on that street
        ArrayList<String> answer = new ArrayList<>();
        for (HashMap.Entry<String, Address> entry : book.entrySet()) {
            if (entry.getValue().getStreet().equals(street)) answer.add(entry.getKey());
        }
        return answer;
    }

    public ArrayList<String> peopleInHouse(String street, String house) {            //Return List of al people that live in that house
        ArrayList<String> answer = new ArrayList<>();
        for (HashMap.Entry<String, Address> entry : book.entrySet()) {
            if (entry.getValue().getHouse().equals(house) && entry.getValue().getStreet().equals(street))
                answer.add(entry.getKey());
        }
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBook that = (AddressBook) o;
        return Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book);
    }
}
