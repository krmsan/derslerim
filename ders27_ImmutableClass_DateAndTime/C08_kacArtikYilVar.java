package ders27_ImmutableClass_DateAndTime;

import java.time.LocalDate;

public class C08_kacArtikYilVar {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        int sayac = 0;
        for (int i = 1987; i < tarih.getYear(); i++) {
            if (tarih.withYear(i).isLeapYear()) {
                sayac++;
            }
        }
        System.out.println(sayac);//9

        sayac=0;
        for (int i = tarih.getYear(); i >1987 ; i--) {

                sayac++;

        }
        System.out.println(sayac);//35


    }
}
