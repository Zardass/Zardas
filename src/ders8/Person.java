package ders8;

public class Person {
    public int age;
    private int salary;
    protected String name;
    String surname;
    static final int experience = 5;

    public void run(){
        System.out.println("it is runnig");
    }
    private void stop(){
        System.out.println("it was stoped");
    }
    protected void walk(){
        System.out.println("it walks");
    }
    void swim(){
        System.out.println("it is swimming");
    }

    private Person(String surname, String name, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Person(int salary,String name) {
        this.salary = salary;
    }
    protected Person(int age){
        this.age = age;
    }
    Person(int experience,int salary){
        this.salary = salary;
        System.out.println("person's experience is " + experience);
    }


}
