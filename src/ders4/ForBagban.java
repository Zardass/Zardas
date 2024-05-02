package ders4;

public class ForBagban {
    public static void main(String[] args) {

        double suVerilen = 1.0;
        double agacBoyumesi = 0.15;
        double agacBoyu = 0.3;
        int gunSayi = 0;
        while (agacBoyu < 10.0) {
            agacBoyu += suVerilen * agacBoyumesi;
            suVerilen *= 1.5;
            gunSayi++;
        }

        System.out.println("Agac 10 metr boya " + gunSayi + " gün sonra catar.");

    }
}
