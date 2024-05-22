package ders9;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {

        String a = "zerdaaaassaaasaa";
        String b = "selim";
        String c = a.concat(b);
        System.out.println(c);

        char find = a.charAt(4);
        System.out.println(find);

        boolean b1 = a.endsWith("sa");
        System.out.println(b1);
        System.out.println(a.indexOf("s,9"));

        String s1 = "Developia";
        String[] bolmek = s1.split("e");
        System.out.println(Arrays.toString(bolmek));

        char[] chars = s1.toCharArray();
        System.out.println(chars);
//        String s2 = "Developer";
//        System.out.println(s1.regionMatches(1,s2,0,5));

    }
}