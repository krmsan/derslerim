package ders06_IfElseStatements;

public class C06_IfElseStatements_Parantezsiz {
    public static void main(String[] args) {

        int not = 56;

        if (not >= 50) {
            System.out.println("sınıfı gectin");
            System.out.println("yazın rahatsın");

        } else {
            System.out.println("kaldın");
            System.out.println("yaz okulu");
        }

        //burda {} siz yazarsak sadace ; e kadar olan satırı allır
        not = 55;
        if (not >= 50)
            System.out.println("sınıfı gectin");
        if (not >= 50)
            System.out.println("hadi iyisin");
        // not=60; gibi yeni bir satır yazarsan else hata verir ilk ; da biter

        else
            System.out.println("kaldın");


    }
}
