package Month;

public class Month {
    //instance variable
    private int monthNumber;
    
    public Month(int m){
        setMonthNumber(m);
    }
    
    public void setMonthNumber(int m){
        if(m >= 1 && m <= 12){
            this.monthNumber = m;
        }else{
            this.monthNumber = 1;
        }
        
    }
    
    public int getMonthNumber(){
        return(this.monthNumber);
    }
    
    public String getMonthName(){
        switch(this.monthNumber){
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "INVALID MONTH NUMBER";
            }
        }
    }
    
    public String getSeason(){
        if(this.monthNumber == 12 || this.monthNumber >= 1 && this.monthNumber <= 2){
            return "Winter";
        }else if(this.monthNumber >= 3 && this.monthNumber <= 5){
            return "Spring";
        }else if(this.monthNumber >= 6 && this.monthNumber <= 8){
            return "Summer";
        }else if(this.monthNumber >= 9 && this.monthNumber <= 11){
            return "Fall";
        }else{
            return "INVALID MONTH NUMBER";
        }
    }
    
    @Override
    public String toString(){
        return "Month Number: " + this.monthNumber + "\nMonth Name: " + getMonthName() 
                + "\nSeason: " + getSeason();
    }
    
    public boolean equals(Month month2){
        return month2.getMonthNumber() == this.monthNumber;
    }
}