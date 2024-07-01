package ders9;

public class Road {
    public static void main(String[] args) {

        double lengthRoad = 10_000;
        double lengthCar = 10;
        double time = 900;
        double lengthTunnel = 0.03 * lengthRoad;

        double timeCar = time * lengthTunnel / lengthRoad;

        System.out.println("Car was driven in tunnel  " + timeCar + " second");
    }
}
