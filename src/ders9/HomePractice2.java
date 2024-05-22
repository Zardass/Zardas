package ders9;

public class HomePractice2 {
    public static void main(String[] args) {

        char[] chars = {'a','b','c','d','e'};
        String s = String.valueOf(chars);
        System.out.println(s);

        System.out.println(s.isBlank());
        System.out.println(s.isEmpty());

        boolean result = isValidString(s);
        System.out.println("result is " + result);
    }
    public static boolean isValidString(String s1){
        return s1.length() == 3 && s1.matches("[a-z A-Z]{3}");

    }
}
