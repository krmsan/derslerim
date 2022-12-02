package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ElemanEkleme {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar);//[ ]

        sayilar.add(10);//boolean
        System.out.println(sayilar);//[10]
        System.out.println(sayilar.add(10));//true
        System.out.println(sayilar);//[10, 10]
        sayilar.add(20);
        System.out.println(sayilar);//[10, 10, 20]
        // basa 44 ekle
        sayilar.add(0,44);
        System.out.println(sayilar);//[44, 10, 10, 20]



        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        sayilar.addAll(eklenecekListe);
        System.out.println(sayilar);//[44, 10, 10, 20, 3, 5]


        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);//[44, 3, 5, 10, 10, 20, 3, 5]




    }
}
