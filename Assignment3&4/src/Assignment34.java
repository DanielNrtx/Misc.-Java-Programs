/*
Math Quiz
Daniel Nelson 9/10/22
JDK 1.18
*/

import java.util.Scanner;

public class Assignment34 {
    public static void main(String[] args) {
        int rightTally = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many math equations would you like to solve: ");
        int times = input.nextInt();
        for(int i = 0; i < times; i++){
            int num1 = (int)(Math.random()*20+1);
            int num2 = (int)(Math.random()*20+1);
            int answer = num1*num2;
            System.out.print(num1 + " * " + num2 + " = " );
            int inAnswer = input.nextInt();
            if(inAnswer == answer){
                System.out.println("YOU ARE RIGHT!\n");
                rightTally++;
            }else{
                System.out.println("go back to 2nd grade ;-;\n");
            }
        }
        System.out.println("You got " + rightTally + " right out of " + times + 
                " questions.");
        double grade = (rightTally/(double)times)*100;
        System.out.println("You got a " + grade + "%");
        if(grade >= 90){
            System.out.println("YOU GOT AN A!");
        }else if (grade >= 80){
            System.out.println("You did ok, I guess");
        }else if (grade >= 70){
            System.out.println("You barely passes ;-;");
        }else{
            System.out.println("Go relearn multiplication");
        }
    }
    
}
