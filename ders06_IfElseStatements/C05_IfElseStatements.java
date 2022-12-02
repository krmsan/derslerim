package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("yas gir");

        double yas =scan.nextDouble();

        if (yas>65){
            System.out.println("emekli");
        }else{
            System.out.println("emeklilik icin "+ (65-yas)+ " sene daha calıs");
        }

    }
}
