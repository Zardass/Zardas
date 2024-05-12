package ders6;

public class MainClass {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.15);
        CalculatorCircle calculatorCircle = new CalculatorCircle();

        calculatorCircle.calculateCircleLength(circle1);
    }
}
