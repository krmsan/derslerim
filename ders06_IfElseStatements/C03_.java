package ders06_IfElseStatements;

import java.util.Scanner;

public class C03_ {
    public static void main(String[] args) {

        //- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("3 kenar gir");
        int k1= scan.nextInt();
        int k2= scan.nextInt();
        int k3 =scan.nextInt();

        if ((k1 == k2 && k2 == k3)||(k1==6||k2==6||k3==6)) {
            System.out.println("eskenar veya en az bir kenerı 6 dır");

        } else {
            System.out.println("degil");
        }




    }
}
