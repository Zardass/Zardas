package ders5;

public class Computer {

    int id;
    String brand;
    String model;
    String color;

    Computer(){
        System.out.println("obyekt yaradildi");
    }
    Computer(String model){
        this.model = model;
    }
    Computer(String model , String color){
        this.model = model;
        this.color = color;
    }
}
