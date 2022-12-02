package ders13_ForLoop;

import java.util.Scanner;

public class C08_MethodOlusturma {
    public static void main(String[] args) {


        // 2 sayi al tola method olustur yazdır
        isteToplaYazdir();
        isteToplaYazdir();// iki defa yapar
        //System.out.println(isteToplaYazdir(3,4));olmaz
    }


    public static void isteToplaYazdir (){
        Scanner scan =new Scanner(System.in);
        System.out.println("iki sayi");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        System.out.println("sayılar toplami"+sayi1+sayi2);
    }
}
