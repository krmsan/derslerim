package ders04_matematikselIslemler;

import java.util.Scanner;

public class C03_Datacasting {
    public static void main(String[] args) {
        //int iki deger al bol ve double olarak yazdır
        Scanner scan=new Scanner(System.in);
        System.out.println("ik sayı gir");

        int sayi1= scan.nextInt();//20
        int sayi2=scan.nextInt();//3
        System.out.println(sayi1/sayi2);//6

        double sayi3= (double) (sayi1/sayi2);//6yani dogru olmaz önce int e cast et
        System.out.println(sayi3);
        double sayi4=(double) sayi1/sayi2;//3.3333333... dogru yazımı
        System.out.println(sayi4);
        //veya
        double sayi5=sayi1/(double)sayi2;//3.33333
        System.out.println(sayi5);

        double sayi6=(double) sayi1/(double)sayi2;//3.33333
        System.out.println(sayi6);


    }
}
