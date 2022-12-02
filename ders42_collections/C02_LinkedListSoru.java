package ders42_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {

    public static void main(String[] args) {
        // Soru : Kullanicidan deger alarak iki String liste olusturun.
        // Kullanici deger girmeyi birakmak icin 0’a basmalidir.
        //	Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        //		liste1 : …….
        //		liste2 : …….
        //		ortak elementler : …….

        System.out.println("Once List1'i olusturalim");
        List<String> list1= kullanicidanAlarakListOlustur();
        System.out.println("Simdi ikinci listeyi olusturalim");
        List<String> list2= kullanicidanAlarakListOlustur();

        System.out.println("Liste1 : " + list1);//Liste1 : [a, b]      [a, c, h, s, b]            [a, b, c, d, e, f, g, h]
        System.out.println("Liste2 : " + list2);//Liste2 : [a, b, c]    [s, h, a, m, k, l]       [d, s, k, c]
        list1.retainAll(list2);//list1 deki sırayı getiriyor
        System.out.println("Ortak elemanlar : " + list1);//[a, b]       [a, h, s]                   [c, d]

        System.out.println("Liste2 : " + list2);//Liste2 : [d, s, k, c]


    }

    public static List<String> kullanicidanAlarakListOlustur(){
        // Kullanicidan deger alarak String liste olusturup main method'a dondurecek
        // Kullanici deger girmeyi birakmak icin 0’a basmalidir.

        List<String> isimListesi= new LinkedList<>();
        Scanner scan= new Scanner(System.in);
        String isim="";

        while (!isim.equalsIgnoreCase("0")){

            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");
            isim= scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }

        }
        return isimListesi;
    }
}
