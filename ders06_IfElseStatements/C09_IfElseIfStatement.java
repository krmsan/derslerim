package ders06_IfElseStatements;

public class C09_IfElseIfStatement {
    public static void main(String[] args) {

        // bir tammsayı al negatifse gecersiz sayı tek basamaksa rakam
        // iki basamaksa iki basaamk yaz değilse buyuk ayı yaz

        int sayi=10;

        if (sayi<0){
            System.out.println("gecersiz sayı");
        } else if (sayi<10) {
            System.out.println("rakamdır");

        } else if (sayi<100) {
            System.out.println("iki basamaklı");

        }else {
            System.out.println("buyuk sayi");
        }



    }
}
