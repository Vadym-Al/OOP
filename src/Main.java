import GUI.ContactForm;
import GUI.Menu;
import GUI.OrderForm;
import GUI.StudentsForm;
import Interface.FormManager;

import javax.swing.*;

public class Main implements FormManager {
    private Menu menu;
    private ContactForm contactForm;
    private OrderForm orderForm;
    private StudentsForm studentsForm;
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
    public Main(){
        menu = new Menu(this);
        contactForm = new ContactForm(this);
        orderForm = new OrderForm(this);
        studentsForm = new StudentsForm(this);
        menu.setVisible(true);
    }

    @Override
    public void swapContact() {
        menu.setVisible(!menu.isVisible());
        contactForm.setVisible(!contactForm.isVisible());
    }

    @Override
    public void swapOrder() {
        menu.setVisible(!menu.isVisible());
        orderForm.setVisible(!orderForm.isVisible());
    }

    @Override
    public void swapStudents() {
        menu.setVisible(!menu.isVisible());
        studentsForm.setVisible(!studentsForm.isVisible());
    }
}
