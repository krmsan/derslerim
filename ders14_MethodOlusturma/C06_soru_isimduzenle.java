package ders14_MethodOlusturma;

public class C06_soru_isimduzenle {
    //Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    //Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    //isim bosluk soyisim seklinde bize donduren bir method olusturun
    //input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

    public static void main(String[] args) {

        String isim="OMER";
        String soyisim="kesen";
        System.out.println(isimsoyisimduzenle(isim, soyisim));
        System.out.println(isimsoyisimduzenle("hey","sen"));//hey sen
    }

    public static String isimsoyisimduzenle (String a,String b){
        String yeniIsimSoyisim=a.substring(0,1).toUpperCase()+
                a.substring(1).toLowerCase()+" "+
                b.substring(0,1).toUpperCase()+
                b.substring(1).toLowerCase();
       // return a+"****"+b ; bu da olurdu
        return yeniIsimSoyisim;
    }
}
