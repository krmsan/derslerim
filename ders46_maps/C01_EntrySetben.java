package ders46_maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class C01_EntrySetben {
    public static void main(String[] args) {
        //ogrenci mapinde sıralı
        // tum ogrencilerin
        // bolum,sınıf,sube,isim,soyisim ve numaralarını yazdırın
        //
        // onceki 2 derste key(Set) ve value(collection) degerlerini topu olarak alabiliyorduk
        // ancak key ve value birlikte kkullanmak istediğinmizde
        // bu işlwemi yapmak zor olur
        //
        // bunun için java Entry interfacini olusturmustur
        // entryler key=vakue ikilisini 1 entry olarak kabul eder.

        Map<Integer,String> ogrenciMap=new TreeMap<>();


                Set<Map.Entry<Integer,String>> ogrenciEntryseti=ogrenciMap.entrySet();


                int sıraNo=1;
        for (Map.Entry<Integer,String> eachEntry:ogrenciEntryseti
             ) {
            System.out.println(sıraNo+"-  "+eachEntry);
            sıraNo++;

        }

        for (Map.Entry<Integer,String> eachentry:ogrenciEntryseti
             ) {
            System.out.println(eachentry.getKey());
        }


    }
}
