public class Main {
    public static void main(String[] args) {
        Contact contact = new Contact();
        Order order = new Order();
        Students students = new Students();
        contact.setID((short) 5);
        System.out.println(contact.toString());
        System.out.println(order.toString());
        System.out.println(students.toString());
    }
}