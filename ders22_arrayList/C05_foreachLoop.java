package ders22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_foreachLoop {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.


        String[] arr = {"Sumeyra", "Mehmet", "Ekrem", "Yilmaz", "Ayse"};

        List<String> yeniList = new ArrayList<>();
        for (String str : arr
        ) {
            if (str.length() % 2 == 0) {//uzunluk cift
                yeniList.add(str.substring(0, str.length() / 2));
            } else {//uzunluk tek
                yeniList.add(str.substring(str.length()/2));   //(str.length()-1)/2 de olur
            }
        }
        System.out.println(yeniList);//[eyra, Meh, rem, Yil, Ay]
    }
}
