package chapter.pkg10.assgn;

public class Customer extends Person{
    private String customerNumber = null;
    
    public Customer(String newName, String newAddress, String newPhoneNumber, String newCustomerNumber) {
        super(newName, newAddress, newPhoneNumber);
        setCustomerNumber(newCustomerNumber);
    }
    
    public void setCustomerNumber(String newCustomerNumber){
        this.customerNumber = newCustomerNumber;
    }
    
    public String getCustomerNumber(){
        return this.customerNumber;
    }
    
    public String toString(){
        return super.toString() + "\nCustomer Number: " + this.customerNumber;
    }
    
}
