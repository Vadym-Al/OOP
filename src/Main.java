import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Contact contact = new Contact();
        Order order = new Order();
        Students students = new Students();

        System.out.println("enter name");
        contact.setName(in.nextLine());
        System.out.println("enter ID");
        contact.setID(in.nextInt());
        contact.fileWriter();

        System.out.println(contact.toString());
        System.out.println(order.toString());
        System.out.println(students.toString());
    }
}
