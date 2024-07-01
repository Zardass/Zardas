package ders10;

public class StringMethod {
    public static void main(String[] args) {

        String original = "Salam Zerda?";
        String target = "Salam";
        String replacement = "sagol";

        String result = acceptString(original, target, replacement);
        System.out.println(result);

    }
    public static String acceptString(String original,String target,String replacement){

        return original.replace(target,replacement);
    }

}
