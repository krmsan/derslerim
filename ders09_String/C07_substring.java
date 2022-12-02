package ders09_String;

import java.util.Locale;

public class C07_substring {
    public static void main(String[] args) {

        String str= "Java gun gectikçe guzellesiyor";

        System.out.println(str.substring(5,8));//gun
        // 5. index dahil (inclusive) 8.index haric (exclusive)
        // 8-5 karakter yazar
        System.out.println(str.substring(9,17)); //gectikce

        System.out.println(str.substring(3,7));//a gu

        String isim ="huseYIN";
        // ilk buyuk gerisi kucuk
        isim = isim.substring(0,1).toUpperCase()+ //ilk harf buyuk
                isim.substring(1).toLowerCase();// 1. index ve sonrası kucuk
        System.out.println(isim);
        System.out.println(isim.substring(2,5));
        // 3. index teki harf yaz e
        System.out.println(isim.substring(3,4));// e
        System.out.println("zor soru cevabı: "+isim.substring(2,2)); // hiç bisey yazmadı "" hiçlik

       // System.out.println(isim.substring(3,2));//hata verir


    }
}
