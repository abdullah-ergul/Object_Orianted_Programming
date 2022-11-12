package BEng_2_1_KasimOzacar.week06_DeeperInClasses;

public class ThisKeyword{
    int x;
    int y;
    int height;
    int lenght;

    public ThisKeyword(){
        // this.x= 0;
        // this.y= 0;
        // this.height= 1;
        // this.lenght= 1;
        this(0,0,1,1);
    }

    public ThisKeyword(int height, int lenght){
        // this.x= 0;
        // this.y= 0;
        // this.height= height;
        // this.lenght= lenght;
        this(0,0,height,lenght);
    }

    public ThisKeyword(int x, int y, int height, int lenght){
        this.x= x;
        this.y= y;
        this.height= height;
        this.lenght= lenght;
    }

    public double getArea(){
        return this.height * this.lenght;
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        ThisKeyword ex1= new ThisKeyword();
        ThisKeyword ex2= new ThisKeyword(10, 15);
        ThisKeyword ex3= new ThisKeyword(-5, 5, 10, 15);

        System.out.println(ex1.getArea());
        System.out.println(ex2.getArea());
        System.out.println(ex3.getArea());
    }
    // ! MAIN SECTION
}