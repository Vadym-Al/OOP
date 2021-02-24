public class Contact {
    /**
     * Frst params
     */
    private short ID;
    private String firstName;
    private String lastName;
    private String address;

    /**
     * Constructor
     */
    public Contact(){
        this.firstName = "Vasya";
        this.lastName = "Sidorov";
        this.address = "Pushkin street 4/2";
    }

    /**
     * geters
     */
    public short getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    /**
     * Setters
     */

    public void setID(short ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * method toString
     * @return
     */
    @Override
    public String toString() {
        return "Contact{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}