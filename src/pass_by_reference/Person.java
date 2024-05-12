package pass_by_reference;

public class Person {
    String name;
    String surname;
    int experienceYear;
    int salary;
    String phone;

    public Person(String name, String surname , int experienceYear , String phone) {
        this.name = name;
        this.surname = surname;
        this.experienceYear = experienceYear;
        this.phone = phone;

    }

    void printInfo(){
        System.out.println("name " + name);
        System.out.println("surname " + surname);
        System.out.println("experience year " + experienceYear);
        System.out.println("salary " + salary);
        System.out.println("phone " + phone);
    }

}
