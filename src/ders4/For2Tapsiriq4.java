package ders4;

public class For2Tapsiriq4 {
    public static void main(String[] args) {

        int eded = 645;
        int min = 0;
        int teklik = eded % 10;
        int onluq = eded / 10 % 10;
        int yuzluk = eded / 100;


        if(teklik < onluq && teklik < yuzluk){
            min = teklik;
        }
        else if(onluq < teklik && onluq < yuzluk){
           min = onluq;
        }
        else{
            min = yuzluk;
        }
        System.out.println(min);

    }
}
