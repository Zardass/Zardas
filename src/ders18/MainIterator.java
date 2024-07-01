package ders18;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {
    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();
        //diomand syntax
        meyveler.add("alma");
        meyveler.add("armud");
        meyveler.add("nar");

        System.out.println(meyveler);

//        for (String meyve : meyveler) {
//            if (meyve.startsWith("a")) {
//                meyveler.remove(meyve);
//            }
//        }
//
//
//        System.out.println(meyveler);

        Iterator<String> iterator = meyveler.iterator();
        while(iterator.hasNext()){
            String novbeti = iterator.next();
            if (novbeti.startsWith("a")) {
                iterator.remove();
            }
        }

        System.out.println(meyveler);

    }
}
