package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIFStatement {
    public static void main(String[] args) {

        //- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin
        // kenar 0 veya negatifse gecersiz yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("3 kenar gir");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3 =scan.nextInt();
         if (k1<=0 || k2<=0 || k3<=0) {
             System.out.println("Gecersiz kena uzulugu");
         }else if (k1==k2 && k2==k3) {
             System.out.println("eskenardır");

         }else {
             System.out.println("eskeanr ucgen degil");
         }


    }
}
