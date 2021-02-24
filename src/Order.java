public class Order extends Universal {
    private String dayTime;
    private byte type;
    public Order(int ID, String name, String courier, String dayTime, byte type) {
        this.ID=ID;
        this.name=name;
        this.lastName=courier;
        this.dayTime=dayTime;
        this.type=type;
    }

    public Order() {
        this(0,"Lada","Calina","day", (byte) 2);
    }

    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public String getDayTime() {
        return dayTime;
    }

    public byte getType() {
        return type;
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public void setType(byte type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{"+super.toString()+", dayTime='" + dayTime + '\''+", type='" + type + '\''+'}';
    }
}
