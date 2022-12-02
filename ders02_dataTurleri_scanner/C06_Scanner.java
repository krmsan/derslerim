package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // iki kenar iste diktörtgen alanı bul
        System.out.println("iki kenar uzunlugu gir" +
                "\niki kenar arsinda entera bas");
        double kenar1= scan.nextDouble();

        double kenar2 = scan.nextDouble();
        System.out.println("dikdortgenin alani: "+ (kenar1*kenar2));




    }
}
