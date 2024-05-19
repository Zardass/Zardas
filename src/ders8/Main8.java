package ders8;

public class Main8 {
    public static void main(String[] args) {

        Person person1 = new Person(3);
        System.out.println(person1.age);

        Person person2 = new Person(2000,"zrd");
        System.out.println(person2.name);

        person1.run();
        person1.walk();
        person1.swim();
    }
}
