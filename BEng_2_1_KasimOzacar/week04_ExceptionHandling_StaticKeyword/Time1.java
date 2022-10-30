package BEng_2_1_KasimOzacar.week04_ExceptionHandling_StaticKeyword;


public class Time1 {
    private int hour;
    private int minute;
    private int second;

    public Time1(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour){
        if(hour < 0 || hour > 23)
            throw  new IllegalArgumentException("Hour valule must be between 0-23");
        this.hour= hour;
    }

    public void setMinute(int minute){
        if(minute < 0 || minute > 59)
            throw  new IllegalArgumentException("Minute valule must be between 0-59");
        this.minute= minute;
    }

    public void setSecond(int second){
        if(second < 0 || second > 59)
            throw  new IllegalArgumentException("Second valule must be between 0-59");
        this.second= second;
    }

    public String toString(){
        return ("Hour: " + hour + "\nMinute: " + minute + "\nSecond: "+ second);
    }

    public String toUniversalString(){
        return (hour + " : " + minute + " : " + second);
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        Time1 ex1= new Time1(18, 48, 24);
        System.out.println(ex1.toUniversalString());

        try{
            Time1 ex2= new Time1(24, 60, 60);
            System.out.println(ex2.toUniversalString());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    // ! MAIN SECTION

}
