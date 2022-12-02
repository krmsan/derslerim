package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // isim soyisim yas al

        System.out.println("isim giriniz");
        String isim=scan.nextLine();

        System.out.println("soy isim");
        String soyIsim= scan.nextLine();

        System.out.println("yas gir");
        double yas =scan.nextDouble();
        /* yada

         */

        System.out.println("isim: " + isim.toUpperCase() +"\nsoy isim: " + soyIsim +
                "\nyasınız: "+ yas +
                "\nbasariyla tamamlandı");


    }
}
