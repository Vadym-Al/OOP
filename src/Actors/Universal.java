package Actors;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Universal{
    protected int ID;
    protected ArrayList<String> arrayList;
    protected String name;
    protected String lastName;

    public Universal() {
        this.arrayList = new ArrayList<>();
        this.ID = 0;
        this.name="unknown";
        this.lastName="unknown";
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'';
    }

    public void fillArray(){
        arrayList.add(toString());
    }

    public void sortArray(){
        Collections.sort(arrayList);
    }
    public void reverseArray(){
        Collections.reverse(arrayList);
    }

    public void fileWriter(){
        try(FileWriter writer = new FileWriter("info.txt", false)) {
            StringBuilder message= new StringBuilder();
            for (String s : arrayList) {
                message.append(s).append("\n");
            }
            writer.write(String.valueOf(message));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}