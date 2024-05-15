package ders7;

public class SadeEded {
    public static void main(String[] args) {
        int[] numbers = {11, 12, 9, 17};


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    System.out.println(numbers[i] + " sade eded deyil");
                }
            }
         //   System.out.println(numbers[i] + " sadedir");
            }



        }
    }

