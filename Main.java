import BEng_2_1_KasimOzacar.week04_ExceptionHandling_StaticKeyword.Circle;
import BEng_2_1_KasimOzacar.week04_ExceptionHandling_StaticKeyword.Time1;


public class Main {
    public static void main(String[] args) {
        Time1 myTime= new Time1(23, 59, 10);
        System.out.println(myTime.toString());

        System.out.println("------------------------");

        Circle myShape1= new Circle(5, 3.1415926535);
        Circle myShape2= new Circle(8);
        System.out.println(myShape1.area());
        System.out.println(myShape2.area());
    }
}
