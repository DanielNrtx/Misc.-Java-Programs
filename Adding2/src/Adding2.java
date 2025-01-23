/*
Daniel N
Program Description - Add 2 numbers with Scanner
written on 9/1/22
JDK 1.18
 */

import javax.swing.JOptionPane;

public class Adding2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter a number: ","Adding",2);
        int number1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,"Enter a number: ");
        int number2 = Integer.parseInt(input);
        int answer = number1 + number2;
        JOptionPane.showMessageDialog(null,number1 + " + " + number2 + " = " + answer);
    }
}