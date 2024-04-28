package ders3;

public class PrimitiveTypeConversionHome {
    public static void main(String[] args) {
        int num1 = 55;
        byte num2 = (byte) num1;
        System.out.println("int deyeri " + num1 + "-in byte-a cevrilmesi: " + num2);

        short num3 = 636;
        byte num4 = (byte) num3;
        System.out.println("short deyeri " + num3 + "-in byte-a cevrilmesi: " + num4);

        long num5 = 458;
        short num6 = (short) num5;
        System.out.println("long deyeri " + num5 + "-in shorta-a cevrilmesi: " + num6);

        long num7 = 92523635483L;
        int num8 = (int)num7;
        System.out.println("long deyeri " + num7 + "-in int-a cevrilmesi: " + num8);

        double num9 = 65787.3;
        int num10 = (int)num9;
        System.out.println("double deyeri " + num9 + "-in int-a cevrilmesi: " + num10);

        char value1 = 'q';
        int num11 = value1;
        System.out.println("char deyeri " + value1 + "-in int-a cevrilmesi: " + num11);

        int num12 = 266;
        char value2 = (char)num12;
        System.out.println("int deyeri " + num12 + "-in int-a cevrilmesi: " + value2);



    }

}
