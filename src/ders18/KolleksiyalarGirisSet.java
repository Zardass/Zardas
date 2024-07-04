package ders18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class KolleksiyalarGirisSet {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(12);
//        System.out.println(list.size());
//        System.out.println(list.get(1));

        HashSet<Integer> set = new HashSet<>();
        set.add(23);
        set.add(13);
        set.add(24);
        set.add(24);

        System.out.println(set);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("alma");
        treeSet.add("armud");
        treeSet.add("alma");

        System.out.println(treeSet);
        treeSet.remove("armud");
        System.out.println(treeSet);

    }
}














