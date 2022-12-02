package ders35_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TryCatch {
    public static void main(String[] args) {
        /// istedigi kadar sayi gir
        // sayiları topla
        // bitirmek için Q ya bas
        // toplam kac sayı girmiş
        // toplamları kac
        // r

        Scanner scan = new Scanner(System.in);
        double grlnsayi = 0;
        double sayitop = 0;
        int sayac = 0;
        boolean devam = true;

        while (devam) {
            System.out.println("sayı giriniz. : \n bitirmek için Q ya bas");

            try {
                grlnsayi = scan.nextDouble(); //nokta gir 2.2
                sayitop += grlnsayi;
                sayac++;

            } catch (InputMismatchException e) {

                String str =scan.next();

                System.out.println(" Q ya bas  :) " );
                //e.printStackTrace();
                System.out.println(e.getMessage());//null
                System.out.println(e.toString());//java.util.InputMismatchException
                if (str.equalsIgnoreCase("Q")){
                    break;
                }

            }
            System.out.println("sayı adedi:" + sayac + "toplamları: " + sayitop);


        }

    }
}
