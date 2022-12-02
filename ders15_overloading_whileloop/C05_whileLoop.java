package ders15_overloading_whileloop;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {

        /*
        sayılar top 500 esit veya buyukse
        -ayı adedi
        -toplamı
        -"yeter yazdır"

         */
        Scanner scan = new Scanner(System.in);
        int sayi1 = 0;
        int top = 0;
        int sayac = 0;

        while (top < 500) {
            System.out.println("sayılar gir");
            sayi1 = scan.nextInt();
            // top=top+sayi1;
            top += sayi1;
            sayac++;


            if (sayac==3){
                break;
            }
        }
        System.out.println("sayı adei:" + sayac + "top: " + top + "yeter");


    }
}
