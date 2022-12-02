package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_ {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("harf gir");
        char hrf =scan.next().charAt(0);
        System.out.println(hrf>=35);//true false
        //hrf = 'a'
        // x  = hrf - 32 // x =65
        // (char) x
        // 'A'
        String byk=""+hrf;
        System.out.println("xxx=> "+byk);
        System.out.println(byk.toUpperCase());

        if (hrf>='a' && hrf<='z') {
            System.out.println((hrf - 32));// 65
            System.out.println((char) (hrf - 32));  // a 97 A 65 fark 32


        } else if (hrf>='A' && hrf<='Z') {
            System.out.println("byk:" +byk.toLowerCase());

        } else {
            System.out.println((char) (hrf-1));
        }

        /*
        if (hrf>='a'&& hrf<='z'){
            System.out.println("kucuk harf: "+ hrf);
        }else {
            System.out.println("");
        }

        */

    }
}
