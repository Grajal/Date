public class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public int getDaysSinceStartYear(){
        int days=0;
        Date current=new Date(1, 1, 2022);        


        for(int i=1;i<this.month;i++){
            days+=getDaysOfMonth(i);
        }
  
        days+=this.day;
        

        return days;
    }

    public int getDaysOfMonth(int month){
        switch(month){
            case 1: 
            case 3:
            case 5:     
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                System.out.println("Error: numero de mes no seleccionado.");
                return -1;
        }
    
    }

    public Date getRandomDateInsideYear(){
        int day=
        int month=
        int year=this.year;
    }

    public int getNumAttemptsToday(){
        int numTries=0;
        
        while(!getRandomDateInsideYear().equals(this)){
            numTries++;
        }

        return numTries;
    }

    public int getMonth(){
        return this.month;
    }

    public void setMonth(int newMonth){
        this.month=newMonth;
    }

    public boolean isSameYear(Date date) {
        return this.getYear()==date.getYear();
    }       

    public boolean isSameMonth(Date date) {
        return this.getMonth()==date.getMonth();
    }

    public boolean isSameDay(){
        return this.getDay()==date.getDay();
    }

    public boolean isSame(Date date){
        return this.equals(date);
    }

    public String getNameMonth(){
        switch(this.getMonth()){
            case 1:
                return "January";
            case 2:     
                return "February";
            case 3: 
                return "March";
            case 4: 
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7: 
                return "July";
            case 8: 
                return "August";
            case 9: 
                return "September";
            case 10: 
                return "October";
            case 11: 
                return "November";
            case 12: 
                return "December";
      
        }
    }

    public boolean validDay(){
        boolean isValid=true;
    
        switch(this.getMonth()){ 
            case 2:
                if(this.getDay()>28) isValid=false;
                break;
            case 4:     
            case 6: 
            case 4: 
            case 6:
            case 9:
            case 11: 
                if(this.getDay()>30) isValid=false;
                break;

            return isValid;
        }
    }

}
