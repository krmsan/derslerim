package ders27_ImmutableClass_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07_PeriodOF {
    public static void main(String[] args) {

        //kac yıl gecti
        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1987, 7, 1);

        Period gecenSure = Period.between(dogumGunu, bugun);

        System.out.println(gecenSure);//P35Y3M28D
        System.out.println(gecenSure.getYears());//35
        System.out.println(gecenSure.getMonths());//3
        System.out.println(gecenSure.getDays());//28




    }
}
