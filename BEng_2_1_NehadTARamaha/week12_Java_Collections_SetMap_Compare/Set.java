package BEng_2_1_NehadTARamaha.week12_Java_Collections_SetMap_Compare;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.TreeSet;


public class Set {
    // ! MAIN SECTION
    public static void main(String[] args) {
        
        AbstractSet<String> hSet = new HashSet<>();
        
        hSet.add("Ted");
        hSet.add("Barney");
        hSet.add("Robin");
        hSet.add("Marshall");
        hSet.add("Lilly");
        hSet.add("Barney");  // Is desn't added

        System.out.println(hSet);


        AbstractSet<Integer> tSet = new TreeSet<>();

        tSet.add(18);
        tSet.add(93);
        tSet.add(7);
        tSet.add(23);
        tSet.add(21);

        System.out.println(tSet);
    }
    // ! MAIN SECTION
}
