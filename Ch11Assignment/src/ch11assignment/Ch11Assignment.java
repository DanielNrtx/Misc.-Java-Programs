/*
Daniel Nelson
ch 11 assignment - exception handling 
12/4/22
 */

package ch11assignment;
import javax.swing.JOptionPane;

public class Ch11Assignment {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter the numerator: ");
        int number1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(null,"Enter the denominator: ");
        int number2 = Integer.parseInt(input);
        System.out.println("The answer to " + number1 + "/" + number2 + "=" + DivisionException.divide(number1,number2));
    }
    
}
