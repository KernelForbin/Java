/**
 * Created by computerlab on 9/18/14.
 */
import javax.swing.*;
public class Calculator {
    public static void main(String[] args) {

    JFrame myFrame = new JFrame();
        myFrame.show();
        myFrame.setSize(500, 500);
        myFrame.setTitle("My Calculator");

    JTextField firstField = new JTextField("My Field");
    JButton button = new JButton("My Button!");

        myFrame.add(firstField);
        myFrame.add(button);

        firstField.setSize(100,20);
        button.setSize(200,50);

    }
}
