package BEng_2_1_NehadTARamaha.Excercises.Exam_21_22;


class Car{
    private int id;
    private int productionYear;
    private int power;
    public static int counter;

    public Car(int id, int productionYear){
        this.id= id;
        this.productionYear= productionYear;
    }

    public void setPower(int power){
        this.power= power;
    }

    public int getProductionYear(){
        return productionYear;
    }

    public int getAge(){
        return 2022-productionYear;
    }

    public void startAndMove(){
        System.out.println("Engine is running now!");
    }

    public void stop(){
        System.out.println("Stopping!");
    }

    @Override
    public String toString(){
        return "Id: "+id+" Production Year: "+productionYear+" Age: "+getAge()+" Power: "+power;
    }
}

class Garage{
    private Car[] cars;

    public Garage(Car[] cars){
        this.cars= cars;
    }

    public void printCarsOlderThan(int age){
        for(Car i:cars){
            if(i.getAge() > age)
                System.out.println(i.toString());
        }
    }
}

public class Q2{
    public static void main(String[] args){
        Car c1= new Car(11, 2002);
        Car c2= new Car(12, 2018);
        Car c3= new Car(13, 2016);
        Car c4= new Car(14, 1995);

        Car[] cars= {c1,c2,c3,c4};

        Garage garage= new Garage(cars);
        garage.printCarsOlderThan(5);  // 2210205305 --> '5'
    }
}
