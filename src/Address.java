public class Address {

    private static String street, house, flat;

    public Address(String input) {
        String[] temp = input.split(",");
        street = temp[0];
        house = temp[1];
        flat = temp[2];
    }

    public static String getStreet() {
        return street;
    }

    public static String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(street + "," + house + "," + flat);
        return string.toString();
    }
}
