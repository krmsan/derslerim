package ders14_MethodOlusturma;

public class C02_StringConcate {
    //verilen iki stringi parametere kabul et
    // aralarında bosluk olan tek string olarak main metodu donduren method yaz
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Candir";
        System.out.println(birlestirmeMetodu(str1, str2));
        System.out.println(birlestirmeMetodu("bu da","olur").toUpperCase());

    }

    public static String birlestirmeMetodu (String a,String b){
        return  a+ " "+b;

    }
}
