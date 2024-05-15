package ders7;

public class ArraysDemoHome {
    public static void main(String[] args) {

        int[] numbers = {12, 11, 9, 16};

        System.out.println("console with help of for loop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nconsole with help of foreach");
        double avarage = 0;
        double sum = 0;
        for (int num : numbers) {
            System.out.print(num + " ");
            sum+=num;
            avarage = sum/numbers.length;
        }
        System.out.println("\navarage of elements of array " + avarage);

        int minNum = numbers[0];
        int maxNum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNum){
                minNum = numbers[i];
            }
            if(numbers[i] > maxNum){
                maxNum = numbers[i];
            }
        }
        System.out.println("minimum element of array " + minNum);
        System.out.println("maximum element of array " + maxNum);

        System.out.print("odd numbers ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.print("\neven numbers ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println("\n------------------------------------");

        //*******************************************88

        boolean swapped = true;
        int counter = 1;
        while(swapped){
            swapped = false;
            for (int i = 0; i < numbers.length - counter; i++) {
                if(numbers[i] > numbers[i + 1]){
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
            counter++;
        }
        for(int i : numbers){
            System.out.println(i);
        }
            }
        }

