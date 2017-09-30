/**
 * Created by computerlab on 11/13/14.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame("User Window");
        myWindow.setVisible(true);
        myWindow.setSize(600,300);
        myWindow.setTitle("User Form");

        JPanel mainPanel = new JPanel();
        myWindow.add(mainPanel);

        JPanel submitPanel = new JPanel();
        myWindow.add(submitPanel);

        JPanel headerPanel = new JPanel();
        myWindow.add(headerPanel);

        GridLayout gridLayout = new GridLayout(4,2);
        myWindow.setLayout(gridLayout);
        mainPanel.setLayout(gridLayout);

        JLabel headerLabel = new JLabel();
        headerPanel.add(headerLabel);

        JLabel nameLabel = new JLabel("Name ");
        mainPanel.add(nameLabel);

        final JTextField nameField = new JTextField();
        mainPanel.add(nameField);

        JLabel addressLabel = new JLabel("Address ");
        mainPanel.add(addressLabel);

        JTextField addressField = new JTextField();
        mainPanel.add(addressField);

        JLabel ssnLabel = new JLabel("SSN # ");
        mainPanel.add(ssnLabel);

        JTextField ssnField = new JTextField();
        mainPanel.add(ssnField);

        JButton submitButton = new JButton("Submit");
        submitPanel.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Thank you for your submission, " + nameField.getText());
            }
        });





    }
}


/**
        JLabel addresslabel = new JLabel("Address ")
        JLabel stufflabel = new JLabel

        JButton button1 = new JButton("My Button");

        JPanel panel1 = new JPanel("Panel 1")
        JPanel panel2 = new JPanel("Panel 2")

        myWindow.add(firstField);
        myWindow.add(button1);

        firstField.setSize(100, 20);
        button.setSize(200, 50);
 */
