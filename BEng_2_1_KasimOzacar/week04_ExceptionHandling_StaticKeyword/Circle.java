package BEng_2_1_KasimOzacar.week04_ExceptionHandling_StaticKeyword;

public class Circle {
    public int radius;
    static public double pi;

    public Circle(int radius){
        this.radius= radius;
    }

    public Circle(int radius, double pi){
        this.radius= radius;
        Circle.pi= pi;
    }

    public double area(){
        return radius*radius*pi;
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        Circle myShape1= new Circle(5, 3.1415926535);
        Circle myShape2= new Circle(8);
        System.out.println(myShape1.area());
        System.out.println(myShape2.area());
    }
    // ! MAIN SECTION
}
