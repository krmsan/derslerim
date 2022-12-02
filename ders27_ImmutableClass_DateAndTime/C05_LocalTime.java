package ders27_ImmutableClass_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        System.out.println(saat);//19:21:37.150106 nano saniye

        LocalTime saat2=LocalTime.of(19,10,20);

        System.out.println(saat.compareTo(saat2));//1 kucukse negatif buyukse pozitif döner

        System.out.println(saat.isAfter(saat2));//true



    }
}
