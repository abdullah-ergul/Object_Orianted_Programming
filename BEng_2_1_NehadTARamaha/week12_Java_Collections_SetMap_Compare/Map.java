package BEng_2_1_NehadTARamaha.week12_Java_Collections_SetMap_Compare;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.TreeMap;


public class Map {
    // ! MAIN SECTION
    public static void main(String[] args) {
        AbstractMap<String,String> hMap = new HashMap<>();
        
        hMap.put("1","Hello");

        System.out.println(hMap);


        AbstractMap<String,String> tMap = new TreeMap<>();

        tMap.put("1","Hi");

        System.out.println(tMap);
    }
    // ! MAIN SECTION
}
