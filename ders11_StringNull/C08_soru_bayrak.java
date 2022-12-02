package ders11_StringNull;

public class C08_soru_bayrak {
    public static void main(String[] args) {

       /* Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
            duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
            basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunlugu en az 10 karakter olmali

        */
        String sifre = "nasilsin Kardes1";
        int bayrak=0;
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk olmalı");
            bayrak++;
        }

        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("son rakam olmalı");
            bayrak++;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk olmasın");
            bayrak++;

        }
        if (!(sifre.length() >= 10)) {
            System.out.println("en az 10 hane olsun");
            bayrak++;

        }
        System.out.println(bayrak);
        if (bayrak==0){
            System.out.println("basarılı");
        }
    }
}
