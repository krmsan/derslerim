package ders14_MethodOlusturma;

public class C05_SubstringOlustur {
    //Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
    //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    //bir method olusturun.
    //- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
    //mesaji verin
    //- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    //yazdirin.
    public static void main(String[] args) {

        String input ="Java java";
        int basIndexi=5;
        int bitIndexi=7;

        kendiSubstringmethodumuz(input,basIndexi,bitIndexi);
        kendiSubstringmethodumuz("jAva",1,3);
    }

    public static void kendiSubstringmethodumuz(String input , int basIndexi,int c){
        if (basIndexi>c){
            System.out.println("bas index bitis indexinden buyuk olamaz");

        } else if (c>=input.length()) {
            System.out.println("bit indexi string sınırları dısında");

        }else {
            //baslangic ve bitis indexlerine gore
            //    //baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
            //    //bir method olusturun.

            for (int i = basIndexi; i < c; i++) {
                System.out.println(input.charAt(i));

            }
        }
        System.out.println("aaaaaaaaaa");
    }
}
