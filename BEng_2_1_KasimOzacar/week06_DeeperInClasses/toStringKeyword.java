package BEng_2_1_KasimOzacar.week06_DeeperInClasses;

public class toStringKeyword {
    int id;
    String name;

    public toStringKeyword(int id, String name){
        this.name= name;
        this.id= id;
    }

    @Override
    public String toString(){
        return name;
    }

    // ! MAIN SECTION
    public static void main(String[] args){
        
    }
    // ! MAIN SECTION
}
