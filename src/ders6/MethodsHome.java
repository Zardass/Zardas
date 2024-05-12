package ders6;

public class MethodsHome {
    public static void main(String[] args) {
        Print print = new Print();
        print.printNumbers(2,9);
        print.printNumbers(-3,10);
        print.printNumbers(4,12);

    }
}
class Print{
    void printNumbers(int begin , int end){
       for(int i = begin; i <= end;i++){
           System.out.println(i);
       }
    }
}
