public class Address {

    private static String street, house, flat;

    public Address(String input) {
        String[] temp = input.split(",");
        street = temp[0];
        house = temp[1];
        flat = temp[2];
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return street + "," + house + "," + flat;
    }

    @Override
    public boolean equals(Object o){
        return this.toString().equals(o.toString());
    }
}
