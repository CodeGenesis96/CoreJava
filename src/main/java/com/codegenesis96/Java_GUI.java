package com.codegenesis96;
import javax.swing.JOptionPane;

public class Java_GUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: "); // Display "Enter your name:" in GUI and wait for a String response
        JOptionPane.showMessageDialog(null,"Hello " + name + ", welcome!"); // Display "Hello <user provided name in the above step> welcome!" in GUI

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: ")); // since we are expecting an int response we use a wrapper class to parse the response to int
        JOptionPane.showMessageDialog(null,"You are " + age + " years old!"); // Display "You are <user provided age in the above step> years old!" in GUI

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm: ")); // since we are expecting a decimal response we use a wrapper class to parse the response to double
        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall!"); // Display "You are <user provided heigh in the above step> years old!" in GUI

        System.out.println();
    }

}
