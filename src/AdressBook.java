import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Objects;


public class AdressBook {

    private Map<String, Address> book;

    public AdressBook(Map book) {
        this.book = book;
    }

    public Map add(String name, String adress) {        //Adding new people in Book
        if (book.containsKey(name)){
            throw new IllegalArgumentException("This name is already im book");
        }
        else {
            Address temp = new Address(adress);
            book.put(name, temp);
        }
        return book;
    }

    public Map delete(String name) {            //Deleting people from Book
        book.remove(name);
        return book;
    }

    public Map newAdress(String name, String adress) {          //Changing address for man
        if (book.containsKey(name)) {
            Address temp = new Address(adress);
            book.put(name, temp);
        } else {
            throw new IllegalArgumentException("Invalid Name");
        }
        return book;
    }

    public String getAdress(String name) {              //Get address by man
        if (book.containsKey(name)) {
            return book.get(name).toString();
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public List<String> peopleOnStreet(String find) {               //Return List of all people that live on that street
        List answer = new ArrayList();
        for (Map.Entry<String, Address> entry: book.entrySet()) {
            if(entry.getValue().getStreet().equals(find)){
                answer.add(entry.getKey());
            }
        }
        return answer;
    }

    public List<String> peopleInHouse(String find) {            //Return List of al people that live in that house
        List answer = new ArrayList();
        for (Map.Entry<String, Address> entry: book.entrySet()) {
            if(entry.getValue().getHouse().equals(find)){
                answer.add(entry.getKey());
            }
        }
        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdressBook that = (AdressBook) o;
        return Objects.equals(book, that.book);
    }

    @Override
    public int hashCode() {

        return Objects.hash(book);
    }
}
