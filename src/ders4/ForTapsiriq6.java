package ders4;

import java.util.Scanner;

public class ForTapsiriq6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededi daxil edin:");
        int num2 = scanner.nextInt();

        if(num2 <=1){
            System.out.println("zehmet olmasa musbet eded daxil edin");
        }

        for(int i = 2;i < num2;i++) {
            if (num2 % i == 0) {
                System.out.println(num2 + " sade eded deyil");
                return;
            }
        }
        System.out.println(num2 + " sadedir");

    }
}
