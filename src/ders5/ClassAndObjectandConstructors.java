package ders5;

public class ClassAndObjectandConstructors {
    public static void main(String[] args) {

        Computer comp1 = new Computer();

        Computer comp2 = new Computer("Mac");

        Computer comp3 = new Computer("Asus" , "black");

        comp1.id = 12;
        comp1.brand = "Pavilion";
        comp1.model = "hp";
        comp1.color = "grey";

        System.out.println("comp1 id-i " + comp1.id);
        System.out.println("comp1 brand " + comp1.brand);
        System.out.println("comp1 model " + comp1.model);
        System.out.println("comp1 color " + comp1.color);

        System.out.println("---------------------------");

        System.out.println("comp2 model " + comp2.model);

        System.out.println("---------------------------");

        System.out.println("comp3 model " + comp3.model);
        System.out.println("comp3 color " + comp3.color);


    }
}
