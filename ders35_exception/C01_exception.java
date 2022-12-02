package ders35_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {
    public static void main(String[] args) {
        //bir tamsayi alin karesini yazdirin ondalıklı girerrse uyari YAZDIRIN ve tekrar isteyin
        // tekrar sayı isteyen bir method olustur b

        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");
        int grlnsayi=0;
        try {
             grlnsayi=scan.nextInt();//ondalıklı girersen hata verir burdan sorası calısmazdı
            System.out.print("sayının karesi: ");// bu satır bile calısmaz
            System.out.println(grlnsayi*grlnsayi);//InputMismatchException 1.1 girerse verdigi hata

        } catch (InputMismatchException e) {

            System.out.println("ondalıklı sayı  girme :)");
            //e.printStackTrace();    hata raporu yazdırır

        }


        System.out.println("grlnsayi*grlnsayi = " + grlnsayi * grlnsayi);


        sayiAlKaresiniYaz();
    }
    public static void sayiAlKaresiniYaz(){

        Scanner scan=new Scanner(System.in);
        System.out.println("sayı giriniz");

        int grlnsayi=0;
        try {
            grlnsayi=scan.nextInt();

            System.out.println("karesi: ");
            System.out.println(grlnsayi*grlnsayi);

        } catch (InputMismatchException e) {
            System.out.println("tam sayı gir");
            sayiAlKaresiniYaz();
            System.out.println("h");
        }
        System.out.println("nnnnnnnnnnnnn");

    }
}
