
package chapter.pkg10.assgn;

public class Person {
    private String name = null;
    private String address = null;
    private String phoneNumber = null;
    
    public Person(String newName, String newAddress, String newPhoneNumber){
        setName(newName);
        setAddress(newAddress);
        setPhoneNumber(newPhoneNumber);
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setAddress(String newAddress){
        this.address = newAddress;
    }
    
    public void setPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    
    @Override
    public String toString(){
        return "Name: " + this.name + "\nAddress: " + this.address +
                "\nPhone: " + this.phoneNumber;
    }
}