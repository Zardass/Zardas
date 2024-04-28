package ders3;

public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        short num1 = 69;
        byte r = (byte)num1;
        System.out.println("short deyeri " + num1 +"-nin byte-a cevrilmesi: " + r);

        short num2 = 589;
        byte t = (byte)num2;
        System.out.println("short deyeri " + num2 +"-nin byte-a cevrilmesi: " + t);

        long num3 = 458;
        int i = (int)num3;
        System.out.println("long deyeri " + num3 +"-nin int-e cevrilmesi: " + i);

        long num4 = 52523635483L;
        int i2 = (int)num4;
        System.out.println("long deyeri " + num4 +"-nin int-e cevrilmesi: " + i2);

        double num5 = 5632.6;
        float i3 = (float)num5;
        System.out.println("double deyeri " + num5 +"-nin float-e cevrilmesi: " + i3);

        char value1 = 'D';
        int i4 = value1;
        System.out.println("char deyeri " + value1 +"-nin int-e cevrilmesi: " + i4);

        int num6 = 123;
        char i5 = (char)num6;
        System.out.println("int deyeri " + num6 +"-nin char-e cevrilmesi: " + i5);


    }

}
