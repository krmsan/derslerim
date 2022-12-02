package ders15_overloading_whileloop;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {
        //Soru : Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        // kullanicinin yeni sifre girmesi isteyin
        // Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin gecerli sifre yazilinca
        // “sifreniz basari ile kaydedildi” yazdirin

        //sartlar :
        // - sifrenin ilk karakteri kucuk harf olmali
        // - sifrenin son karakteri sayi olmali

        Scanner scan = new Scanner(System.in);
        boolean sifreGecerliMi = false;
        String sifre = "";
        int bayrak =0;

        while (sifreGecerliMi != true) {

            System.out.println("sifre gir");
            sifre = scan.nextLine();
            bayrak=0;// buna bi bak


            if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
                System.out.println("sifre ilk karkter kucuk olmalı");
                bayrak++;
            }
            if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
                System.out.println("son karakter sayı olmalı");
                bayrak++;
            }
            if (bayrak!=0){
                sifreGecerliMi=true;
                System.out.println("basarılı");
            }

        }
    }
}
