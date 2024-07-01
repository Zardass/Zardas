package ders17;

public class Main17 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("salam");

        MainThread t1 = new MainThread();
        t1.start();
        //for (int i = 0; i <10 ; i++) {
            //single thread
//            Thread.sleep(500);
//            System.out.println(i);

        System.out.println("sagol");
    }
}
