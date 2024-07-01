package ders18;

public class KolleksiyalarGiris {
    public static void main(String[] args) {

        BizimMassiv<Integer> m1 = new BizimMassiv<>(100);
        //dinamik massiv
        m1.elaveEt(1);
        m1.elaveEt(3);
        m1.elaveEt(4);
        m1.elaveEt(3);

        System.out.println(m1);//memorylocation
    }
}
