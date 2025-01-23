/*
Daniel Nelson
10/29/22
Month Class
 */

package Month;

public class Chapter8Assignment {
    public static void main(String[] args) {
        Month month1 = new Month(3);
        Month month2 = new Month(8);
        System.out.println(month1.toString());
        System.out.println(month2.toString());
        if(month1.equals(month2)){
            System.out.println(month1.getMonthName() + " is equal to " + month2.getMonthName());
        }else{
            System.out.println(month1.getMonthName() + " is not equal to " + month2.getMonthName());
        }
    }
}
