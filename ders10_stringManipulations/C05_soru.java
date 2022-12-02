package ders10_stringManipulations;

public class C05_soru {
    public static void main(String[] args) {

        // mail kontrolu yap
        // @ yoksa gecersiz
        // @gmail.com yoksa adres gir
        // @gmail.com ile bitmezse yazım hatası
        String str= "ali@gmail.com";
        if (!str.contains("@")){
            System.out.println("gecersiz email");
        } else if (!str.contains("@gmail.com")) {
            System.out.println("gmail adresi gir");

        } else if (!str.endsWith("@gmail.com")) {
            System.out.println("yazım hatası");

        }else {
            System.out.println("basarı ile kaydedildi");
        }
    }
}
