package BEng_2_1_NehadTARamaha.week11_Java_Collections_List;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class ArrLists {
    // ! MAIN SECTION
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("Albert");
        arrList.add("Marie");
        arrList.add("Nicola");
        arrList.add("Galilei");
    
        System.out.println("Array List: " + arrList);
        arrList.set(2, "Isacc");
        System.out.println("Updated Array List: " + arrList);
    
    
        List<String> linkList = new LinkedList<>();
        linkList.add("Albert");
        linkList.add("Marie");
        linkList.add("Nicola");
        linkList.add("Galilei");
    
        System.out.println("\nLinked List: " + linkList);
    }
    // ! MAIN SECTION
}
