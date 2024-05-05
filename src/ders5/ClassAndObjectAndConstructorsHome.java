package ders5;

public class ClassAndObjectAndConstructorsHome {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.id = 1407;
        emp1.name = "Zarda";
        emp1.surname = "Salim";
        emp1.phone = "0515359848";
        emp1.address = "Baku";
        emp1.salary = 7000;

        Employee emp2 = new Employee("Sahib");

        Employee emp3 = new Employee("Mehriban","Selimova");

        Employee emp4 = new Employee("Rahiba","05126372",12347);

        System.out.println(emp1.name + "'s id: " + emp1.id);
        System.out.println(emp1.name + "'s surname: " + emp1.surname);
        System.out.println(emp1.name + "'s phone: " + emp1.phone);
        System.out.println(emp1.name + "'s adress: " + emp1.address);
        System.out.println(emp1.name + "'s salary: " + emp1.salary);

        System.out.println("---------------------------");

        System.out.println(emp2.name);

        System.out.println("---------------------------");

        System.out.println(emp3.name + "'s surname: " + emp3.surname);

        System.out.println("---------------------------");

        System.out.println(emp4.name + "'s phone: " + emp4.id + " and salary: " + emp4.salary);


    }
}
