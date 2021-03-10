package GUI;

import Interface.FormManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;

public class Menu extends JFrame {
    private final FormManager manager;
    private JPanel pane = new JPanel(new GridBagLayout());
    public Menu(final FormManager manager){
        this.manager=manager;
        this.setTitle("Main Menu");
        this.setBounds(750,350,400,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pane);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx=1;
        gbc.weighty=1;
        gbc.fill=GridBagConstraints.HORIZONTAL;

        ActionListener firstAction = (ActionEvent e) -> manager.swapContact();
        ActionListener secondAction = (ActionEvent e) -> manager.swapOrder();
        ActionListener thirdAction = (ActionEvent e) -> manager.swapStudents();
        ActionListener fourthAction = (ActionEvent e) -> {
            try(FileReader reader = new FileReader("info.txt")) {
                StringBuilder message= new StringBuilder();
                int c;
                while((c=reader.read())!=-1){
                    message.append((char) c);
                }
                JOptionPane.showMessageDialog(null, message.toString(),"Output",JOptionPane.PLAIN_MESSAGE);
            } catch (IOException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        };

        JButton button1 = new JButton("Contact");
        gbc.gridx=0;
        gbc.gridwidth=1;
        gbc.gridy=0;
        button1.addActionListener(firstAction);
        pane.add(button1,gbc);

        JButton button2 = new JButton("Order");
        gbc.gridx=2;
        gbc.gridwidth=1;
        gbc.gridy=0;
        button2.addActionListener(secondAction);
        pane.add(button2,gbc);

        JButton button3 = new JButton("Students");
        gbc.gridx=4;
        gbc.gridwidth=1;
        gbc.gridy=0;
        button3.addActionListener(thirdAction);
        pane.add(button3,gbc);

        JButton button4 = new JButton("Read from File");
        gbc.gridx=2;
        gbc.gridwidth=1;
        gbc.gridy=1;
        button4.addActionListener(fourthAction);
        pane.add(button4,gbc);

        JLabel label1 = new JLabel(" ");
        gbc.gridx=1;
        gbc.gridwidth=1;
        gbc.gridy=0;
        pane.add(label1,gbc);

        JLabel label2 = new JLabel(" ");
        gbc.gridx=3;
        gbc.gridwidth=1;
        gbc.gridy=0;
        pane.add(label2,gbc);
    }
}
