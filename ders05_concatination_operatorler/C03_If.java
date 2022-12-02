package ders05_concatination_operatorler;

import java.util.Scanner;

public class C03_If {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        if (a>b){
            System.out.println("a b den kucuktur");}// bisey yazmaz sart yanlıs
        if (b>a){
            System.out.println("b a dan buyuktur"); //bunu yazar


            //iki sayı al 100 den buyukse 100 yazdır
            // eger 2. sayı ciftse cift yaz
            //eger ilk sayı ikinci den buyukse ilk buuktur yazdır
            Scanner scan=new Scanner(System.in);
            System.out.println("iki sayı gir");
            int sayi1= scan.nextInt();
            int sayi2= scan.nextInt();

            if (sayi1>100){
                System.out.println("100 den buyuktur");
            }
            if (sayi2 %2 ==0){
                System.out.println("sayı cifttir");
            }
            if (sayi1>sayi2){
                System.out.println("ilk sayı buyuktur");
            }

            boolean sonuc=a<b;
            if (sonuc){
                System.out.println("a b den kucuktur");
            }


        }

    }
}
