package BEng_2_1_KasimOzacar.week04_ExceptionHandling_StaticKeyword;

public class Circle {
    public int radius;
    static public double pi;

    public Circle(int radius){
        this.radius= radius;
    }

    public Circle(int radius, double pi){
        this.radius= radius;
        this.pi= pi;
    }

    public double area(){
        return radius*radius*pi;
    }
}
