public class Order {
    /**
     * Frst params
     */
    private short ID;
    private String name;
    private String courier;
    private String dateTme;
    private byte type;
    /**
     * Constructor
     */
    public Order() {
        this.ID=1;
        this.name="Window";
        this.courier="Petrenko";
    }
    /**
     * geters
     */

    public short getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getCourier() {
        return courier;
    }

    public String getDateTme() {
        return dateTme;
    }

    public byte getType() {
        return type;
    }
    /**
     * Setters
     */

    public void setID(short ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public void setDateTme(String dateTme) {
        this.dateTme = dateTme;
    }

    public void setType(byte type) {
        this.type = type;
    }
    /**
     * method toString
     * @return
     */

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", courier='" + courier + '\'' +
                ", dateTme='" + dateTme + '\'' +
                ", type=" + type +
                '}';
    }
}