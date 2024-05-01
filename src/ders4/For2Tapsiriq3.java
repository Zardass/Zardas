package ders4;

public class For2Tapsiriq3 {
    public static void main(String[] args) {

        int eded = 645;
        int max = 0;
        int teklik = eded % 10;
        int onluq = eded / 10 % 10;
        int yuzluk = eded / 100;


        if(teklik > onluq && teklik > yuzluk){
            max = teklik;
        }
        else if(onluq > teklik && onluq > yuzluk){
           max = onluq;
        }
        else{
            max = yuzluk;
        }
        System.out.println(max);

    }
}
