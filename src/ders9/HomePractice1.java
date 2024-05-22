package ders9;

import java.util.Arrays;

public class HomePractice1 {
    public static void main(String[] args) {

        String name = "Məhərrəm";
        System.out.println("name: " + name);

        String message = "Java dilini öyrənmək maraqlı və faydalıdır";
        System.out.println("message: " + message);
        System.out.println("length of message: " + message.length());
        System.out.println("7. symbol: " + message.charAt(6));
        System.out.println("indexof : " + message.indexOf("n"));
        System.out.println("lowercase: " + message.toLowerCase());
        System.out.println("uppercase: " + message.toUpperCase());
        System.out.println("finding any symbol: " + message.contains("a"));
        System.out.println("endwith: " + message.endsWith("dir"));
        System.out.println("startwith: " + message.startsWith("Java"));

        name = " Ayxan ";
        System.out.println("trim: " + name.trim());
        name = "Kamil";
        System.out.println("finding first 4 symbols: " + name.substring(0,5));
        name = "Hüseyn Mehdizadə";
        String[] arr = name.split("");
        System.out.println(Arrays.toString(arr));


    }
}
