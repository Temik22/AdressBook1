import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Objects;


public class AdressBook {

    private Map<String, String> book;

    public AdressBook(Map book) {
        this.book = book;
    }

    public Map add(String name, String adress) {        //Adding new people in Book
        if (book.containsKey(name)){
            throw new IllegalArgumentException("This name is already im book");
        }
        else {
            book.put(name, adress);
        }
        return book;
    }

    public Map delete(String name) {            //Deleting people from Book
        book.remove(name);
        return book;
    }

    public Map newAdress(String name, String adress) {          //Changing address for man
        if (book.containsKey(name)) {
            book.put(name, adress);
        } else {
            throw new IllegalArgumentException("Invalid Name");
        }
        return book;
    }

    public String getAdress(String name) {              //Get address by man
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    public List<String> peopleOnStreet(String find) {               //Return List of all people that live on that street
        List answer = new ArrayList();
        for (Map.Entry<String, String> entry: book.entrySet()) {
            if(entry.getValue().split(",")[0].equals(find)){
                answer.add(entry.getKey());
            }
        }
        return answer;
    }

    public List<String> peopleInHouse(String find) {            //Return List of al people that live in that house
        List answer = new ArrayList();
        for (Map.Entry<String, String> entry: book.entrySet()) {
            if(entry.getValue().split(",")[1].equals(find)){
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
