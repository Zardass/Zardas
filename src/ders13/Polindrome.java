package ders13;

public class Polindrome {
    public static void main(String[] args) {
        int number = 12341;
        String s = String.valueOf(number);

        int end = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(end--)) {
                System.out.println("deil");
                break;
            }
        }
    }
}
