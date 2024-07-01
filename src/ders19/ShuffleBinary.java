package ders19;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleBinary {
    public static void main(String[] args) {
        ArrayList<String> meyveler = new ArrayList<>();
        //diomand syntax
        meyveler.add("nar");
        meyveler.add("armud");
        meyveler.add("alma");

        System.out.println(meyveler);
        Collections.sort(meyveler);
        System.out.println(meyveler);
       int index =  Collections.binarySearch(meyveler,"alma");
        System.out.println(index);
        Collections.shuffle(meyveler);
        System.out.println(meyveler);


    }
}
