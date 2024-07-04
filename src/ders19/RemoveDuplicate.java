package ders19;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> BeforeNumbers = new ArrayList<>();
        BeforeNumbers.add(12);
        BeforeNumbers.add(45);
        BeforeNumbers.add(12);
        BeforeNumbers.add(3);
        BeforeNumbers.add(12);
        System.out.println("original list " + BeforeNumbers);

        ArrayList<Integer> AfterNumbers = new ArrayList<>();

        for (Integer number:BeforeNumbers) {
            if (!AfterNumbers.contains(number)) {
                AfterNumbers.add(number);
            }
        }
        BeforeNumbers = AfterNumbers;
        Collections.sort(BeforeNumbers);
        System.out.println("After removing "+BeforeNumbers);

    }
}
