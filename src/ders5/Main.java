package ders5;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.price = 20_000;
        bmw.maxSpeed = 200;
        bmw.model = "X230";

        Car kia = new Car();
        kia.model = "kssk";
        kia.price = 1233333;
        kia.start();
      //  System.out.println(kia.speed);

    }
}
