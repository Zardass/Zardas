package ders4;

import java.util.Scanner;

public class ForTapsiriq5 {
    public static void main(String[] args) {

        System.out.println("5.tapsiriq");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num = scanner.nextInt();
        int num1 = num;
        int sum = 0;
        while(num1  != 0){
            int qaliq = num1 % 10;
            sum += qaliq;
            num1 /=10;
        }

        System.out.println("ededin reqemlerinin cemi: " + sum);
    }
}
