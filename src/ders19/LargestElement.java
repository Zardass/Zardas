package ders19;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(34);
        numbers.add(5);
        numbers.add(12);
        Collections.sort(numbers);
        //System.out.println(numbers.getLast());
        System.out.println(numbers.get(numbers.size() - 1));
    }
}
