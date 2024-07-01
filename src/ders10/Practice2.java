package ders10;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Random random = new Random();
        int num = random.nextInt(30,51);
        System.out.println("number ; " + num);

        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();

        System.out.println("SQRT: " + Math.sqrt(num2));
        System.out.println("POW: " + Math.pow(num2,2));

        double num3 = scanner.nextDouble();
        num3 = Math.round(num3 * 10) / 10.0;
        System.out.println("round: " + num3);


    }
}
