package ders41_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        for (Integer each : sayilar

        ) {
            System.out.print(each);

        }


    }
}
