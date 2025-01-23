/*
loop practice
*/
public class BottlesOfSoda {

    public static void main(String[] args) {
        for(int n=99; n>0; n--){
            System.out.println(n + " bottles of soda on the wall,"
                    + "\n" + n + " bottles of soda."
                    + "\nTake one down and pass it around,"
                    + "\n" + (n-1) + " bottles of soda on the wall.");
        }
        System.out.println("Go to the store and buy some more!");
    }
    
}
