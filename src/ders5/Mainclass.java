package ders5;

public class Mainclass {
    public static void main(String[] args) {

        Student s1 =  new Student("Zerda" , 14);
        Student s2 =  new Student("Guler" , 15);
        Student s3 = s2;
        Student s4 = s1;
        s1 = null;
        s2 = null;
        s4 = new Student("Rahibe",17);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
