/*
    Daniel Nelson
    5/17/22
    write methods, conditionals, generate random numbers and ask if the output 
    is correct or incorrect
 */

import java.util.Scanner;

public class Ch5Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = false;
        
        do{
            int random = (int) (Math.random()*10+ 1);
            boolean answer = switchAnimal(random);
            System.out.println("Is this statement true or false?");
            String response = input.next();
            boolean check = Boolean.parseBoolean(response.toLowerCase());
            compare(check, answer);
            
            System.out.println("Would you like to play again? (yes/no)");
            response = input.next();
            if("yes".equals(response)){
                playAgain = true;
            }else{
                playAgain = false;
                System.out.println("Thank you for playing with me today!");
            }
        }while(playAgain == true);
    }
    
    public static boolean switchAnimal(int number){
        //this couldve been made shorter with a loop and librarie but its ok :3
        switch(number){
            case 1 -> {
                System.out.println("Fleas can jump 350 times its body length.");
                return true;
            }
            case 2 -> {
                System.out.println("Hummingbirds are the only birds that can fly backwards.");
                return true;
            }
            case 3 -> {
                System.out.println("Crocodiles cannot stick their tongue out.");
                return true;
            }
            case 4 -> {
                System.out.println("Starfish do not have a brain.");
                return true;
            }
            case 5 -> {
                System.out.println("Slugs have 4 noses.");
                return true;
            }
            case 6 -> {
                System.out.println("Only male mosquitoes bite.");
                return false;
            }
            case 7 -> {
                System.out.println("Polar bear skin is white!");
                return false;
            }
            case 8 -> {
                System.out.println("The only mammal capable of flight is the bat.");
                return false;
            }
            case 9 -> {
                System.out.println("Cats have 24 muscles in each ear.");
                return false;
            }
            case 10 -> {
                System.out.println("A newborn kangaroo is the size of an orange.");
                return false;
            }
            default -> {
                    return true;
            }
        }
    }
    
    public static void compare(boolean response, boolean answer){
        if(response == answer){
            System.out.println("Correct!");
        }else{
            System.out.println("Incorrect!");
        }
    }
}
