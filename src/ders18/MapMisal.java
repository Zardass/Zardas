package ders18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MapMisal {
    public static void main(String[] args) {

        ArrayList<String> siyahi = new ArrayList<>();
        siyahi.add("zerda");
        siyahi.add("zerda");
        siyahi.add("zerda");
        siyahi.add("zerda");
        siyahi.add("aysu");
        siyahi.add("aysu");
        siyahi.add("Ulker");
        siyahi.add("fegan");
        siyahi.add("fegan");


        TreeMap<String,Integer> adlar = new TreeMap<>();

        for(String ad:siyahi){
            if(adlar.containsKey(ad)){
                Integer say = adlar.get(ad);
                say++;
                adlar.replace(ad,say);
            }else{
                adlar.put(ad,1);
            }
        }
        System.out.println(adlar);


    }
}
