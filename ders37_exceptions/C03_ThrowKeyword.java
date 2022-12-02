package ders37_exceptions;

public class C03_ThrowKeyword {
    public static void main(String[] args) {



        int sayi=1;
        System.out.println(sayi);
        try {
            sayi =2;
            System.out.println(sayi);
            if (sayi==2)throw new RuntimeException();


            sayi = 3;

            sayi = 4;

            sayi = 5;
        }catch (Exception e){


    }
        sayi=6;
        System.out.println(sayi);
    }
}
