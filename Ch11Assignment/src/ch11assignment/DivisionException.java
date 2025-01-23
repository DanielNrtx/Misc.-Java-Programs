package ch11assignment;

public class DivisionException extends Exception{
    public DivisionException(){
        super("Error: you cannot divide by zero");
    }
    
    public static double divide(int a,int b){
        double result = 0;
        boolean success = true;
        try{
            result = a/b;
        }catch(Exception DivisionException){
            success = false;
            System.out.println(DivisionException);
            
        }
        return result;
    } 
    
    //Gonna be honest here, Exception handling is probably really simple, but I always forget how to do it. unlike everything else in programming. ...THANK YOU FOR TEACHING US THIS YEAR (even though I was only capable of making it to 5 classes)
}
