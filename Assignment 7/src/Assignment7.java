/*
 Soda Assignment thingy, counter, money? stonks...? yeah, this is
pretty much the description I have for this program 
Daniel Nelson
10/7/22
 */

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //get soda types
        int sodaTypes = -1;
        while(sodaTypes <= 0){
            System.out.print("How man soda types would you like to sell: ");
            sodaTypes = input.nextInt();
            input.nextLine();//Scanner has a issue where it wont let you read an int then a line or it wont take an answer. so this just stops it
        }
       
        //find names of sodas
        String[] sodaNames = new String[sodaTypes];
        for(int i = 0; i < sodaTypes; i++){
            System.out.print("What is the name of soda type " + (i+1) + ": ");
            sodaNames[i] = input.nextLine();
        }
        
        //number of sodas sold (im only following example, but it could be simplied into one for loop
        int[] sodaCount = new int[sodaTypes];
        int sumTotal = 0;
        int highest = 0;
        int lowest = 0;
        for(int i = 0; i < sodaTypes; i++){
            //checks for negative
            do{
                System.out.print("How many " + sodaNames[i] + " were sold: ");
                sodaCount[i] = input.nextInt();
            }while(sodaCount[i] < 0);
            sumTotal += sodaCount[i];
            if(sodaCount[i] > sodaCount[highest]){
                highest = i;
            }
            if(sodaCount[i] < sodaCount[lowest]){
                lowest = i;
            }
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Total Sold: " + sumTotal);
        System.out.println("Highest Sold: " + sodaNames[highest]);
        System.out.println("Lowest Sold: " + sodaNames[lowest]);        
    }
    
}
