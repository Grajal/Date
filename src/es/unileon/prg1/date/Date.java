package es.unileon.prg1.date;

public class Date{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws DateException{
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    //Métodos getter

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    //Métodos setter

    public void setDay(int newDay) throws DateException{
        if(newDay>this.getDaysOfMonth(newDay)||newDay<1) {
        	throw new DateException("El dia no es correcto");
        }else {
        	this.day=newDay;
        }
    }

    public void setMonth(int newMonth) throws DateException{
        if(newMonth<1||newMonth>12) {
        	throw new DateException("El mes no es correcto");
        }else {
        	this.month=newMonth;
        }
    }

    public void setYear(int newYear) throws DateException{
        if(newYear<0) {
        	throw new DateException("No puede haber annos negativos");
        }else {
        	this.year=newYear;
        }
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

    public Date getRandomDateInsideYear() throws DateException{
        Date date;
        do{
            int day=(int)(Math.random()*31+1);
            int month=(int)(Math.random()*12+1);
            int year=this.year;
            date=new Date(day, month, year);
        }while(!date.isValid());      
        return date;
    }

    public int getNumAttemptsToday_while() throws DateException{
        int numTries=0;
        
        while(!getRandomDateInsideYear().isSame(this)){
            numTries++;
        }

        return numTries;
    }

    public int getNumAttemptsToday_dowhile() throws DateException{
        int numTries=0;

        do{ 
            if(!getRandomDateInsideYear().isSame(this)){
                numTries++;
            }   
        }while(!getRandomDateInsideYear().isSame(this));
        return numTries;
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
        return (this.getDay()==date.getDay()&&this.getMonth()==date.getMonth()&&this.getYear()==date.getYear());
    }

    public String getNameMonth(int month){
        String monthName="";
        switch(month){
            case 1:
                monthName="January";
                break;
            case 2:     
                monthName="February";
                break;
            case 3: 
                monthName="March";
                break;
            case 4: 
                monthName="April";
                break;
            case 5:
                monthName="May";
                break;
            case 6:
                monthName="June";
                break;
            case 7: 
                monthName="July";
                break;
            case 8: 
                monthName="August";
                break;
            case 9: 
                monthName="September";
                break;
            case 10: 
                monthName="October";
                break;
            case 11: 
                monthName="November";
                break;
            case 12: 
                monthName="December";
                break;
      
        }
        return monthName;
    }
   
    public String getSeason(){
        String season="";
        if(3<=this.getMonth()&&6>this.getMonth()){   
            season="Spring";
        }else if(6<=this.getMonth()&&9>this.getMonth()){
            season="Summer";
        }else if(9<=this.getMonth()&&12>this.getMonth()){
            season="Fall";
        }else{
            season="Winter";
        }
        return season;
    }

    public StringBuffer getDatesUntilEndOfMonth() throws DateException{
        StringBuffer cadena=new StringBuffer();
        Date date;
        for(int i=this.getDay();i<=this.getDaysOfMonth(this.getMonth());i++){
            date=new Date(i, this.getMonth(), this.getYear());
            cadena.append(date.toString()+" ");
        }
        return cadena;
    }
    
    public StringBuffer getSameMonthsDaysAsDate(){
        StringBuffer cadena=new StringBuffer();
        if(this.getMonth()==2){
            cadena.append("No hay ningun mes que tenga los mismos dias que febrero.");
        }else{
            
             for(int i=1;i<=12;i++){
                if(this.getDaysOfMonth(i)==this.getDaysOfMonth(this.getMonth())){
                    if(i!=this.getMonth()){
                        cadena.append(getNameMonth(i)+" ");
                    }
                }
            }
        }
        return cadena;
    }

    public int getMonthsUntilYearEnds(){
        int numMonths=0;
        for(int i=this.getMonth();i<=12;i++){
            numMonths++;
        }
        return numMonths;
    }

    /* 
    public String getDayOfWeek(String firstDayOfWeekInYear){
        int sumDays=0;
        for(int i=1;i<this.getMonth();i++){
            sumDays+=getDaysOfMonth(i);
        }
        sumDays+=this.getDay();
        
        //Pendiente por hacer 
    }
    */

    public boolean isValid(){
        boolean isValid=true;

        if(this.getDay()>31||this.getMonth()>12||this.getDay()<1||this.getMonth()<1){
            isValid=false;
        }else{
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
        }
    
        
        return isValid;
    }

    public String toString(){
        return this.getDay()+"/"+this.getMonth()+"/"+this.getYear();
    }
}