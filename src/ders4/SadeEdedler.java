package ders4;

public class SadeEdedler {
    public static void main(String[] args) {

        int a = 6;
        int b = 2;
        int c = 0;
        boolean sadedir = true;
        while (c < a) {
            sadedir = true;
            for (int i = 2; i <= b; i++) {
                if (b % i == 0) {
                    sadedir = false;
                    break;
                }
            }
            if(sadedir){
                c++;
                System.out.println(b);
            }
            b++;
        }
    }
}
