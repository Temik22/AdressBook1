import java.util.*;


public class AdressBook {

    private HashMap book;

    public AdressBook(HashMap book){
        this.book = book;
    }

    public void add(String name, String adress) {
        book.put(name, adress);
    }

    public void delete(String name) {
        book.remove(name);
    }

    public void newAdress(String name, String adress) {
        if (book.containsKey(name)) {
            book.put(name, adress);
        } else {
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public String getAdress(String name) {
        return book.get(name).toString();
    }

    public String peopleOnStreet(String street) {
        List keys = new ArrayList(book.keySet());
        List values = new ArrayList(book.values());
        String answer = "";
        for (int i = 0; i < values.size(); i++){
            if (values.get(i).toString().split(",")[0].equals(street)){
                answer += keys.get(i).toString() + ' ';
            }
        }
        return answer;
    }

    public String peopleInHouse(String house) {
        List keys = new ArrayList(book.keySet());
        List values = new ArrayList(book.values());
        String answer = "";
         for (int i = 0; i < values.size(); i++){
             if (values.get(i).toString().split(",")[1].equals(house)){
                answer += keys.get(i).toString() + ' ';
             }
         }
         return answer;
    }

}
