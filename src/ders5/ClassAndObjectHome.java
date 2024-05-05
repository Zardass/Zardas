package ders5;

public class ClassAndObjectHome {
    public static void main(String[] args) {

        Person person1 = new Person();

        person1.id = 1407;
        person1.name = "Zarda";
        person1.surname = "Salim";
        person1.age = 19;
        person1.phone = "0515359848";

        Person person2 = new Person();

        person2.id = 2207;
        person2.name = "Fagan";
        person2.surname = "Maharramli";
        person2.age = 19;
        person2.phone = "0555163616";

        System.out.println(person1.name + "-nin id : " + person1.id);
        System.out.println(person1.name + "-nin soyadi : " + person1.surname);
        System.out.println(person1.name + "-nin yasi : " + person1.age);
        System.out.println(person1.name + "-nin telefon nomresi : " + person1.phone);

        System.out.println("---------------------------------");

        System.out.println(person2.name + "-nin id : " + person2.id);
        System.out.println(person2.name + "-nin soyadi : " + person2.surname);
        System.out.println(person2.name + "-nin yasi : " + person2.age);
        System.out.println(person2.name + "-nin telefon nomresi : " + person2.phone);


    }
}
