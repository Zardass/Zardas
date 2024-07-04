package ders19;

import java.util.TreeSet;

public class UnionAndIntersectionSet {
    public static void main(String[] args) {

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(3);
        set1.add(2);
        System.out.println("set1 " + set1);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(8);
        set2.add(2);
        set2.add(6);
        set2.add(5);
        System.out.println("set2 " + set2);

        TreeSet<Integer> union = new TreeSet<>(set1);
        union.addAll(set2);
        System.out.println("unioning set1 and set2 " + union);

        TreeSet<Integer> intersection = new TreeSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("intersection set1 and set2 " + intersection);
    }

}
