package ders04_matematikselIslemler;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        /*
        - Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
isleminin sonucununun tamsayi kismini yazdirin.
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayi gir");

        double sayi1= scan.nextDouble();//20.8
        double sayi2= scan.nextDouble();//4

        int sonuc=(int) (sayi1/sayi2);//5
        System.out.println(sonuc);// sonuc tamsayı olur



    }
}
