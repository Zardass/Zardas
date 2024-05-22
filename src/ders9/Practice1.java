package ders9;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        String name = "Cavid";
        System.out.println("name: " + name);

        String message = "Java dili güclü və effektli bir proqramlaşdırma dilidir";
        System.out.println("message: " + message);
        System.out.println("length of message: " + message.length());
        System.out.println("finding i symbol of message: " + message.indexOf("i") );
        System.out.println("message with lower cases: " + message.toLowerCase());
        System.out.println("message with Uppercases: " + message.toUpperCase());
        System.out.println("finding any symbol in message: " + message.contains("lif"));
        System.out.println("endwith any symbol: " + message.endsWith("dirr"));
        System.out.println("start with any symbol: " + message.startsWith("Java"));

        name = " Adil ";
        System.out.println("cleaning gaps: " + name.trim());
        name = "Bextiyar";
        System.out.println("finding first 4 symbols: " + name.substring(0,4));
        name = "Əli Həsənov";
        String[] array1 = name.split("");
        System.out.println(Arrays.toString(array1));




    }
}
