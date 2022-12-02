package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_Carpım {
    public static void main(String[] args) {

        // iki sayısyı parametre kabul edip carpımlarını bize dönduren method yaz

        Scanner scan =new Scanner(System.in);
        System.out.println("sayı gir");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        System.out.println(carpimMethodu(sayi1,sayi2));//12
        double carpımsonucu = carpimMethodu(3,4);

        System.out.println(carpımsonucu);//12
    }


    public static double carpimMethodu(double sayi1 , double sayi2 ){
        System.out.println("carpım metodu calıstı");
        return  sayi1*sayi2;

    }



}
