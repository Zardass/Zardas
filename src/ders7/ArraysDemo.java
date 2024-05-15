package ders7;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = {1, 0, 3, 4, 5};
        int sum = 0;
        double avarage = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            avarage = sum / numbers.length;
        }
        System.out.println("sum of elements of array: " + sum);
        System.out.println("----------------------------");
        System.out.println("avarage of elements of array: " + avarage);
        System.out.println("----------------------------");

        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        }
        System.out.println("minimum element of array is " + minNumber);
        System.out.println("----------------------------");

        System.out.print("odd numbers of array : ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

