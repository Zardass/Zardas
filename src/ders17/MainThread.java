package ders17;

public class MainThread  extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
    }

    }
    }

