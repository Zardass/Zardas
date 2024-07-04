package ders19;

import java.util.LinkedList;

public class Home1_3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);

        numbers.remove(2);
        numbers.poll();
        System.out.println(numbers);
    }
}
