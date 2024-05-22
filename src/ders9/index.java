package ders9;

public class index {
    public static void main(String[] args) {
        String sentence = "James yazib ki  javani yazib ki yazaq kodu isledekki";

        String word = "yaz";

        int count = 0;
        int index = -1;
        do{
            index = sentence.indexOf(word,index+1);
            if (index == -1)break;
            count++;
            System.out.println(index);
        }
        while(index != -1);
        System.out.println("count of " + word + " is " + count);
    }
}