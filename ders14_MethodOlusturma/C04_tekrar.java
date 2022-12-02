package ders14_MethodOlusturma;

public class C04_tekrar {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println(C01_Carpım.carpimMethodu(a, b));

        String c="Nasil";
        String d="yani";
        String sonuc = C02_StringConcate.birlestirmeMetodu(c, d);
        System.out.println(C02_StringConcate.birlestirmeMetodu(c, d));
        System.out.println(sonuc);

        String e = "Bu da mi oldu";
        System.out.println(C03_Stringterscevirme.stringiTersCevir(e));
        System.out.println(C03_Stringterscevirme.stringiTersCevir("bunu ters cevir"));


        String str ="Java";
        str.toLowerCase().charAt(0);
        System.out.println(str);
        System.out.println( str.toLowerCase().charAt(0));
    }

}
