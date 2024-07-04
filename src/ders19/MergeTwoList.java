package ders19;

import java.util.ArrayList;

public class MergeTwoList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println("first list " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println("second list " + list2);

        list1.addAll(list2);
        System.out.println("merged lists " +  list1);
    }
}
