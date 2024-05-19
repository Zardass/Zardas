package ders7;

public class SadeEded {
    public static void main(String[] args) {
        int[] numbers = {11, 12, 9, 17,98};

        for(int ededim:numbers){
            if (sadedirmi(ededim)){
                System.out.println(ededim);
            }
        }
    }
    static boolean  sadedirmi(int eded){
        boolean netice = false;

        for (int i = 2; i < eded; i++) {
            if (eded % i == 0){
                netice = false;
                break;
            }
        }
        return netice;
        }
    }
