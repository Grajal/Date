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
}
