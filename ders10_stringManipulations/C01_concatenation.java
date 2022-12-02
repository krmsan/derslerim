package ders10_stringManipulations;

public class C01_concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2 ="Guzeldir";
        boolean bl=true;
        int sayi=20;
        double dbl=3.54;
        System.out.println(str1+bl+sayi);// Javatrue20
        //System.out.println(bl+sayi); hata verir string dısında toplamaya izinn yok

        System.out.println(sayi+dbl);//23.54
        //System.out.println(str1.concat(bl));  yanlıs
        // concat sadece string birlestirmek için

        System.out.println(str1.concat(" ").concat(str2));// java guzeldir



    }
}
