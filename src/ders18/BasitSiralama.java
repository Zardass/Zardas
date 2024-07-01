package ders18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class BasitSiralama {
    public static void main(String[] args) {
        ArrayList<Integer> saylar = new ArrayList<>();
        saylar.add(2);
        saylar.add(44);
        saylar.add(5);
        saylar.add(13);
        System.out.println(saylar);

        Collections.sort(saylar);
        System.out.println();

        ArrayList<Car> masinlar = new ArrayList<>();
        masinlar.add(new Car(20000,300));
        masinlar.add(new Car(22000,300));
        masinlar.add(new Car(19000,230));
        masinlar.add(new Car(18000,150));
        System.out.println(masinlar);
//        Collections.sort(masinlar);
//        System.out.println(masinlar);
//        Collections.sort(masinlar, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.price-o2.price;
//            }
//
//    });
//      //  System.out.println(masinlar);

        Comparator<Car> comparator =
                Comparator.comparing(Car::getPrice).thenComparing(Car::getSpeed);

        Collections.sort(masinlar, comparator);
        System.out.println(masinlar);
    }
}
