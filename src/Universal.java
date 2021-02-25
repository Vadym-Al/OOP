import java.io.FileWriter;
import java.io.IOException;

public class Universal {
    protected int ID;
    protected String name;
    protected String lastName;
    public Universal() {
        this.ID = 0;
        this.name="unknown";
        this.lastName="unknown";
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

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "ID=" + ID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'';
    }
    public void fileWriter(){
        try(FileWriter writer = new FileWriter("info.txt", false)) {
            writer.write(toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
