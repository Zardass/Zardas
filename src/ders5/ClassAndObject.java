package ders5;

public class ClassAndObject {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.id = 123;
        book1.name = "Leyla";
        book1.author = "Alexandra Cavelius";
        book1.authorCount = 1;
        book1.description = "drama";

        Book book2 = new Book();
        book2.id = 14;
        book2.name = "qumarbaz";
        book2.author = "Dostoyevski";
        book2.authorCount = 2;
        book2.description = "qumar";

        System.out.println("kitabin id - i " + book1.id);
        System.out.println("kitabin adi " + book1.name);
        System.out.println("kitabin muellifi " + book1.author);
        System.out.println("kitabin author count " + book1.authorCount);
        System.out.println("kitabin tesviri: " + book1.description);

        System.out.println("-----------------------------------");

        System.out.println("kitabin id - i " + book2.id);
        System.out.println("kitabin adi " + book2.name);
        System.out.println("kitabin muellifi " + book2.author);
        System.out.println("kitabin author count " + book2.authorCount);
        System.out.println("kitabin tesviri: " + book2.description);

    }
}
