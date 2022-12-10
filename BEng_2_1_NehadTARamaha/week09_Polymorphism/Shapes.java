package BEng_2_1_NehadTARamaha.week09_Polymorphism;

import java.lang.Math;


abstract class Shape2D {
    protected final static double PI= 3.141592;
    protected double height;
    protected double radius;
    protected double width;

    public Shape2D(double height, double width) {
        this.height= height;
        this.width= width;
    }

    public Shape2D(double radius) {
        this.radius= radius;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "2D Shape";
    }
}

class Circle extends Shape2D {

    public Circle(double radius) {
        super(radius);
    }

    public double getArea() {
        return PI * super.radius * super.radius;
    }
}

class Square extends Shape2D {

    public Square(double width) {
        super(width,width);
    }

    public double getArea() {
        return super.height * super.width;
    }
}

class Rectangle extends Shape2D {

    public Rectangle(double height, double width) {
        super(height,width);
    }

    public double getArea() {
        return super.height * super.width;
    }
}

abstract class Shape3D extends Shape2D {
    protected double depth;

    public Shape3D(double depth, double height, double width) {
        super(height, width);
        this.depth= depth;
    }

    public Shape3D(double height, double radius) {
        super(radius);
        super.height= height;
    }

    public abstract double getVolume();

    @Override
    public String toString() {
        return "3D Shape";
    }
}

class Cylinder extends Shape3D {

    public Cylinder(double height, double radius) {
        super(height, radius);
    }

    public double getVolume() {
        return PI * Math.pow(super.radius,2) * super.height;
    }

    public double getArea() {
        return 2 * PI * super.radius * super.height + 2 * PI * Math.pow(super.radius, 2);
    }
}

class Sphere extends Shape3D {

    public Sphere(double depth, double radius) {
        super(depth, radius);
    }

    public double getVolume() {
        return ((double)4/3) * PI * Math.pow(super.radius,3);
    }

    public double getArea() {
        return 4 * PI * Math.pow(super.radius, 2);
    }
}

class Pyramid extends Shape3D {

    public Pyramid(double depth, double height, double width) {
        super(depth, height, width);
    }

    public double getVolume() {
        return super.depth * super.width * super.height / 3;
    }

    public double getArea() {
        double slant1= Math.sqrt(Math.pow(height, 2) - Math.pow(depth, 2));
        double slant2= Math.sqrt(Math.pow(height, 2) - Math.pow(width, 2));
        
        return super.depth * super.width + 2 * (slant1 * super.depth / 2) + 2 * (slant2 * super.width / 2);
    }
}

class Cone extends Shape3D {

    public Cone(double height, double radius) {
        super(height, radius);
    }

    public double getVolume() {
        return PI * Math.pow(super.radius, 2) * super.height / 3;
    }

    public double getArea() {
        double slant= Math.sqrt(Math.pow(height, 2) - Math.pow(radius, 2));

        return PI * super.radius * slant + PI * Math.pow(super.radius, 2);
    }
}


public class Shapes {
    // ! MAIN SECTION
    public static void main(String[] args) {
        
    }
    // ! MAIN SECTION
}
