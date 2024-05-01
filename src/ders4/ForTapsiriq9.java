package ders4;

import java.util.Scanner;

public class ForTapsiriq9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("zehmet olmasa eded daxil edin: ");
        int number = scanner.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " cut ededdir");
        }else{
            System.out.println(number + " cut eded deil");
        }

    }
}
