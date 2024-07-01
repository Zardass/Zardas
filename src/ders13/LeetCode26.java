package ders13;

import java.util.Arrays;

public class LeetCode26 {
    public static void main(String[] args) {
        int[] massiv = {6,1,2,3,3,4,123,4,5,5};
        System.out.println("before" + Arrays.toString(massiv));
        Arrays.sort(massiv);
        System.out.println("after" + Arrays.toString(massiv));

        for (int i = 0; i < massiv.length - 1; i++) {
            if (massiv[i] == massiv[i + 1]) {
                
            }
        }

    }
}
