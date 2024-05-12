package ders6;

public class CalculatorCircle {

    void calculateCircleLength(Circle circle){
        circle.length = 2 * 3.14 * circle.radius;
        System.out.println(circle.length);
    }
}
