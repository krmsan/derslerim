package ders26_passByvalue_immutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

        double fiyat = 100;

        System.out.println(indirimUygula(fiyat));// 90
        System.out.println(indirimUygula(fiyat));//90
        System.out.println(indirimUygula(fiyat));//90

        System.out.println(fiyat); // 100

        fiyat= indirimUygula(fiyat);

        System.out.println("indirim uygulanmis yeni fiyat : " + fiyat); // 90

        System.out.println(indirimUygula2(fiyat));//62.99  ana fiyatı 90 a atadık
    }
    /*
    Kodlarimizin anlasi;ir olmasi icin main method'dan diger method'lara
    parametre olarak gonderdigimiz variable'lar icin ayni isimli variable
    olusturmayi TERCIH EDERIZ

    Java method'lar arasinda gecis yaparken variable'i degil
    variable'in value'sunu pass eder

    Bu Java'nin Pass By Value'yu tercih etmesinden kaynaklaniyor


    Eger method'un icerisinde yaptiginiz degisikligin
    main method icin de gecerli olmasini isterseniz
    main method icerisinde
    fiyat= indirimUygula(fiyat);

    atamasini yapabiliriz.
     */

    public static double indirimUygula(double fiyat) {
        // %10 indirim yapsin

        fiyat= fiyat*0.9;  // fiyata atama yaptik kalici olarak 90 oldu

        return fiyat;
    }


    public static double indirimUygula2(double fiyat) {
        // %10 indirim yapsin

        fiyat= fiyat*0.7;  // fiyata atama yaptik kalici olarak 70 oldu

        return fiyat;
    }
}
