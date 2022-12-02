package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_iterator {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
       // Iterator obje=new Iterator)(); olmaz ıterator ınterface tir obje olusturulamaz
        Iterator it1=sayilar.iterator();
        //tum elementleri iterator kullanarak yazdıralım
        System.out.println("it1.hasNext() = " + it1.hasNext());//true  yanında eleman varmı diyor en basta
        System.out.println(it1.next());//10    yana git donerken sayıyı getir diyor


        System.out.println(it1.hasNext());//true
        System.out.println(it1.next());//20
        System.out.println("00000000000000000000000000000000000000");

        while (it1.hasNext()){
            System.out.println(it1.next());//30  40  false
        }

       // System.out.println(it1.hasNext());
       // System.out.println(it1.next());
        Iterator it2=sayilar.iterator();
        System.out.println("=========================");
        while (it2.hasNext()){
            System.out.println(it2.next());//10   20    30   40
        }

    }
}
