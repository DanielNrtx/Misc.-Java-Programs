/*
 Daniel Nelson
11/20/22
Chapter 10 assgn abt person and customer class
 */

package chapter.pkg10.assgn;

public class Chapter10Assgn {
    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Person("Bob Smith","123 Main Street, Plano, TX 75074","972-333-4444");
        arr[1] = new Person("Daniel Nelson","9879 Willow Rd, Plano, TX 75074","214-460-5568");
        arr[2] = new Customer("Bob Smith","123 Main Street, Plano, TX 75074","972-333-4444","1234-5678"); //I didn't want to make up new name or numbers. So act like I did.
        arr[3] = new Customer("Daniel Nelson","9879 Willow Rd, Plano, TX 75074","214-460-5568","9876-5432");
        
        for(int i = 0; i <=3; i++){
            System.out.println(arr[i].toString());
        }
    }
    
}
