package ders29_stringBuilder_AccesModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class C01_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);//2022-11-04T21:08:51.787996

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(zaman.format(dtf1));//04/11/2022

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d:MMM:YY");

        System.out.println(dtf2);//Value(DayOfMonth)':'Text(MonthOfYear,SHORT)':'Localized(ReducedValue(WeekBasedYear,2,2,2000-01-01))

        System.out.println(zaman.format(dtf2));//4:Nov:22

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");
        System.out.println(zaman.format(dtf3));//4.November.2022 Friday


        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(zaman.format(dtf4));//09:19 PM

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(zaman.format(dtf5));//16:19



    }
}
