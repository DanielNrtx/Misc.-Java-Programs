/*
Daniel N
Program Description - Add 2 numbers with Scanner
written on 9/1/22
JDK 1.18
 */

import java.util.Scanner;
        
public class Adding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = input.nextInt();
        int answer = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + answer);
    }
}