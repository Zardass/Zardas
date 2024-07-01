package ders10;

public class StringMethodHome {
    public static void main(String[] args) {

        String word1 = "zerdas";
        String word2 = "da";

        boolean result = checkWord(word1,word2);
        System.out.println(result);
    }

    public static boolean checkWord(String word1,String word2) {
        return  word1.endsWith(word2);
    }


}
