package BEng_2_1_KasimOzacar.week01_Introduction_to_OOP;

public class Hello {
    public void write_Hello() {
        System.out.println("Hello, World!");
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        Hello example= new Hello();
        example.write_Hello();
    }
    // ! MAIN SECTION
}
