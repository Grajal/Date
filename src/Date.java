import java.lang.Math.*;

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
        Date date;
        do{
            int day=(int)(Math.random()*31+1);
            int month=(int)(Math.random()*12+1);
            int year=this.year;
            date=new Date(day, month, year);
        }while(!date.isValid());      
        return date;
    }

    public int getNumAttemptsToday(){
        int numTries=0;
        
        while(!getRandomDateInsideYear().equals(this)){
            numTries++;
        }

        return numTries;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
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

    public boolean isSameDay(Date date){
        return this.getDay()==date.getDay();
    }

    public boolean isSame(Date date){
        return this.equals(date);
    }

    public String getNameMonth(){
        String monthName="";
        switch(this.getMonth()){
            case 1:
                monthName="January";
            case 2:     
                monthName="February";
            case 3: 
                monthName="March";
            case 4: 
                monthName="April";
            case 5:
                monthName="May";
            case 6:
                monthName="June";
            case 7: 
                monthName="July";
            case 8: 
                monthName="August";
            case 9: 
                monthName="September";
            case 10: 
                monthName="October";
            case 11: 
                monthName="November";
            case 12: 
                monthName="December";
      
        }
        return monthName;
    }

    public boolean isValid(){
        boolean isValid=true;
    
        switch(this.getMonth()){ 
            case 2:
                if(this.getDay()>28) isValid=false;
                break;
            case 4:     
            case 6: 
            case 9:
            case 11: 
                if(this.getDay()>30) isValid=false;
                break;
        }
        return isValid;
    }

    public boolean equals(Date date){
        if(this.getDay()==date.getDay()&&this.getMonth()==date.getMonth()&&this.getYear()==date.getYear()) return true; 
        else return false;
    }
}
