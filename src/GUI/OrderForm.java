package GUI;

import Actors.Order;
import Interface.FormManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderForm extends JFrame{
    private final Order order = new Order();
    public OrderForm(final FormManager manager) {
        this.setTitle("Order");
        this.setBounds(750, 350, 700, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel(new GridBagLayout());
        this.setContentPane(pane);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel label1 = new JLabel("ID");
        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        pane.add(label1, gbc);

        JLabel label2 = new JLabel("First Name");
        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        pane.add(label2, gbc);

        JLabel label3 = new JLabel("Last Name");
        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        pane.add(label3, gbc);

        JLabel label4 = new JLabel("Day Time");
        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.gridy = 3;
        pane.add(label4, gbc);

        JLabel label5 = new JLabel("Type");
        gbc.gridx = 4;
        gbc.gridwidth = 1;
        gbc.gridy = 4;
        pane.add(label5, gbc);

        JTextField textField1 = new JTextField();
        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        pane.add(textField1, gbc);

        JTextField textField2 = new JTextField();
        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        pane.add(textField2, gbc);

        JTextField textField3 = new JTextField();
        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        pane.add(textField3, gbc);

        JTextField textField4 = new JTextField();
        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.gridy = 3;
        pane.add(textField4, gbc);

        JTextField textField5 = new JTextField();
        gbc.gridx = 5;
        gbc.gridwidth = 1;
        gbc.gridy = 4;
        pane.add(textField5, gbc);

        ActionListener backMenu = (ActionEvent e) -> manager.swapOrder();
        ActionListener addInfo = (ActionEvent e) -> {
            order.setID(Integer.parseInt(textField1.getText()));
            order.setName(textField2.getText());
            order.setLastName(textField3.getText());
            order.setDayTime(textField4.getText());
            order.setType(Byte.parseByte(textField5.getText()));
            order.fillArray();
        };
        ActionListener show = (ActionEvent e) -> {
            StringBuilder message = new StringBuilder();
            for (int i = 0; i < order.getArrayList().size(); i++) {
                message.append(order.getArrayList().get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null, message.toString(), "Output", JOptionPane.PLAIN_MESSAGE);
        };
        ActionListener sort = (ActionEvent e) -> order.sortArray();
        ActionListener revers = (ActionEvent e) -> order.reverseArray();
        ActionListener save = (ActionEvent e) -> order.fileWriter();

        JButton button1 = new JButton("Add Info");
        gbc.gridx = 4;
        gbc.gridwidth = 2;
        gbc.gridy = 5;
        button1.addActionListener(addInfo);
        pane.add(button1, gbc);

        JButton button2 = new JButton("Show");
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        button2.addActionListener(show);
        pane.add(button2, gbc);

        JButton button3 = new JButton("Sort");
        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        button3.addActionListener(sort);
        pane.add(button3, gbc);

        JButton button4 = new JButton("Save as txt");
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        button4.addActionListener(save);
        pane.add(button4, gbc);

        JButton button5 = new JButton("Reverse");
        gbc.gridx = 2;
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        button5.addActionListener(revers);
        pane.add(button5, gbc);

        JButton button6 = new JButton("Back to Menu");
        gbc.gridx = 1;
        gbc.gridwidth = 2;
        gbc.gridy = 2;
        button6.addActionListener(backMenu);
        pane.add(button6, gbc);

        JLabel html1 = new JLabel("");
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        pane.add(html1, gbc);

        JLabel html2 = new JLabel("");
        gbc.gridx = 3;
        gbc.gridwidth = 1;
        gbc.gridy = 0;
        pane.add(html2, gbc);
    }
}
