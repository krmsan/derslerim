package ders41_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_iterator_soru {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);


        ListIterator it1 = sayilar.listIterator();
        for (int i = 0; i < 3; i++) {

            it1.set((Integer)it1.next()+3);
        }
        System.out.println(sayilar);//[13, 23, 33, 40]
    }
}
