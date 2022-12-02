package ders27_ImmutableClass_DateAndTime;

import java.time.LocalDate;

public class C04_DateTime {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);//2022-10-29

        System.out.println(tarih.minusDays(1));//2022-10-28
        System.out.println(tarih.minusWeeks(1).minusDays(1));//2022-10-21

        System.out.println(tarih.plusMonths(1).plusWeeks(1).plusDays(1));//2022-12-07

        System.out.println("3 ay somra: " + tarih.plusMonths(3));//2023-01-29

        System.out.println(tarih.getMonthValue());//10
        System.out.println(tarih.getMonth());//OCTOBER
        System.out.println(tarih.getDayOfWeek());//SATURDAY
        System.out.println(tarih.getDayOfYear());//302
        System.out.println(tarih.getYear());//2022

        System.out.println(tarih.isLeapYear());//false

        System.out.println(tarih.withYear(2000).isLeapYear());//true

        System.out.println(tarih.withYear(1987).withMonth(7).withDayOfMonth(1).getDayOfWeek());//WEDNESDAY


        LocalDate date1 = LocalDate.of(tarih.getYear(), 7, 1);//2022-07-01

        LocalDate date2 = tarih.withYear(tarih.getYear()).withMonth(7).withDayOfMonth(1);//2022-07-01
        System.out.println(date1);
        System.out.println(date2);


    }
}
