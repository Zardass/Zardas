package pass_by_reference;

public class MainClass {
    public static void main(String[] args) {

        Person person1 = new Person("Zerda", "Selim" , 3,"0513539848");
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(person1);
        person1.printInfo();
    }
}
