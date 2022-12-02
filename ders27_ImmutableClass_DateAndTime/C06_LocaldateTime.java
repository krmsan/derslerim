package ders27_ImmutableClass_DateAndTime;

import java.time.LocalDateTime;

public class C06_LocaldateTime {
    public static void main(String[] args) {

        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);//2022-10-29T19:31:00.737719

        System.out.println(zaman.getDayOfYear());//302
        System.out.println(zaman.getDayOfWeek());//SATURDAY



    }
}
