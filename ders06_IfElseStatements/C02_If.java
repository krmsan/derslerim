package ders06_IfElseStatements;

import java.util.Scanner;

public class C02_If {
    public static void main(String[] args) {

        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("3 kenar gir");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3 =scan.nextInt();

        if (k1==k2 && k2==k3 ){
            System.out.println("eskenardır");
        }


    }
}
