package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar); // [1, 2, 3, 5, 3, 2, 5, 1, 2, 4, 5, 3, 4, 5]

        /*
         Listemiz integer'lardan olusuyorsa
         biz int bir deger yazdigiizda hep index kabul ettiginden
         istedigimiz elementi obje olarak girip sildirmek icin
         onceden tanimlamamiz gerekir
         */

        Integer silinecekObje = 4;// obje olmalı buyuk int yazılır
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);//sadece buldugu ilk 4 ü siler

        // tum 3'leri sildirin
        silinecekObje = 3;

        while (sayilar.contains(silinecekObje)) {
            sayilar.remove(silinecekObje);
        }
        silinecekObje=2;
        while (sayilar.remove(silinecekObje)) {

        }

        System.out.println(sayilar); // [1, 2, 5, 2, 5, 1, 2, 5, 4, 5]

        silinecekObje = 9;
        System.out.println(sayilar.remove(silinecekObje)); // false


        //sayilar.remove(20); // IndexOutOfBoundsException
        System.out.println(sayilar.remove(0));//1 i sildim diyor 0. indexi
    }
}
