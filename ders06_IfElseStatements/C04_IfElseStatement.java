package ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatement {
    public static void main(String[] args) {
        //- Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("karakter gir");
        char krk =scan.next().charAt(0);

        if (krk>='A' && krk<='Z'){    // || desek a  veya 1 de girdigimizde de buyuk yazar
            System.out.println("buyuk harf");
        } else {
            System.out.println("degil");
        }



    }
}
