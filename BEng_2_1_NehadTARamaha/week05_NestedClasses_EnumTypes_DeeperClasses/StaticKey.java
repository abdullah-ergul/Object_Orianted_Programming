package BEng_2_1_NehadTARamaha.week05_NestedClasses_EnumTypes_DeeperClasses;

public class StaticKey {
    public int num= 10;
    static int _num= 0;

    public StaticKey(){
        this.num++;
        _num++;
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        StaticKey ex1= new StaticKey();
        System.out.println("Example 1 num: "+ex1.num);
        System.out.println("Example 1 static num: "+StaticKey._num);

        StaticKey ex2= new StaticKey();
        System.out.println("Example 2 num: "+ex2.num);
        System.out.println("Example 1 static num: "+StaticKey._num);
        System.out.println("Example 2 static num: "+StaticKey._num);
    }
    // ! MAIN SECTION

}
