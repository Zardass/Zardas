package ders6;

public class Methods {
    public static void main(String[] args) {

        PrintWord printWord = new PrintWord();
        printWord.printName(5,"Zerda");

    }
    }
    class PrintWord{
        void printName(int count,String name){
            while(count > 0){
                System.out.println(name);
                count--;
            }
        }
    }

