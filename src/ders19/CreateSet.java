package ders19;

import java.util.HashSet;
import java.util.Scanner;

public class CreateSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(1);
        set1.add(12);
        set1.add(1);
        System.out.println(set1);

       int num = 3;

       if (set1.contains(num)){
           System.out.printf("there is  %d element in list" , num);
       }else {
           System.out.printf("there is not  %d element in list" , num);
       }
    }
}
