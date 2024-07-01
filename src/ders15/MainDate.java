package ders15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MainDate {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2024, 6, 12);
        System.out.println("our time: " + date1);
        LocalDate date2 = LocalDate.now();
        System.out.println("current time: " + date2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String format1 = LocalTime.now().format(formatter);
        System.out.println("local time to string: " + format1);

        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println("current time: " + datetime1);

        LocalDate date = LocalDate.parse("2023-01-01");
        System.out.println("string to localtime: " + date);

        LocalDate tomorrow5 = date2.plusDays(5);
        System.out.println("today + 5 " + tomorrow5);


        LocalTime todatTime = LocalTime.now();
        LocalTime substractTime = todatTime.minusHours(3);
        System.out.println("substract time " + substractTime);


    }
}
