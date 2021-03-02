package Actors;

import java.util.ArrayList;

public class Contact extends Universal {
    private String address;
    public Contact(int ID, String name, String lastname, String address, ArrayList<String> arrayList) {
        this.arrayList=arrayList;
        this.ID=ID;
        this.name=name;
        this.lastName=lastname;
        this.address=address;
    }
    public Contact(){
        this(0,"Vasya","Makarov","Lorens 5",new ArrayList<>());
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

    public String getAddress() {
        return address;
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

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Actors.Contact{"+super.toString()+", address='" + address + '\''+'}';
    }

    @Override
    public void fillArray() {
        super.fillArray();
    }

    @Override
    public void sortArray() {
        super.sortArray();
    }

    @Override
    public void reverseArray() {
        super.reverseArray();
    }

    @Override
    public ArrayList<String> getArrayList() {
        return super.getArrayList();
    }

    @Override
    public void fileWriter() {
        super.fileWriter();
    }
}
