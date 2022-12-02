package ders45_maps;

import java.util.Map;

public class Mbenimclass extends MapMethodDeposu {
    public static void main(String[] args) {
        Map<Integer, String> yeniMap22 = MapMethodDeposu.omapOlustur2();
        System.out.println(yeniMap22);//{1=a-b-c-d-11, 2=e-f-g-h-12, 3=j-k-l-m-13}
        System.out.println("yeniMap22.get(2) = " + yeniMap22.get(2));// e-f-g-h-12

        int no = 1;
        String mapis = MapMethodDeposu.isim(yeniMap22, no);

        System.out.println(mapis);//a

        yeniMap22.put(4, "ahmet-can-11-fen-14");//sadece bu clasa eklendi
        yeniMap22.put(5, "mehmet-han-10-mat-15");//Run time da eklendi ve bittiler

        yeniMap22.put(2, "ayse-can-11-fen-14");//2 nolu tamamen degisti

        System.out.println(yeniMap22);//
        //{1=a-b-c-d-11,                   2=ayse-can-11-fen-14
        // , 3=j-k-l-m-13,
        // 4=ahmet-can-11-fen-14, 5=mehmet-han-10-mat-15} .

        no = 5;
        mapis = MapMethodDeposu.isim(yeniMap22, no);

        System.out.println(mapis);//mehmet


        String isdegis = MapMethodDeposu.isimdegis(yeniMap22, 2, "omer");

        System.out.println(isdegis);
        System.out.println(yeniMap22);

        no = 70;
        System.out.println(yeniMap22);
        Map<Integer, String> yenimap45 = MapMethodDeposu.isimdegismap(yeniMap22, no, "tuba");
        System.out.println(yenimap45);




        Map<Integer, String> varargmap = MapMethodDeposu.vararglayap(yeniMap22, 3, "ahmet-", "can-", "11-", "fen");
        System.out.println(varargmap);
        System.out.println("00000000000000000000000000000");

Map<Integer,String>sonMapim=MapMethodDeposu.yeniMapOlusturduk();
        System.out.println("sonMapim = " + sonMapim);//
        // {1=--C-9-fen, 2=--C-9-fen, 3=--C-9-fen}
        Map<Integer,String>ssmap=MapMethodDeposu.elementdegistir(sonMapim,1,"asya","avrupa","Bursa","11","mat");
        System.out.println("ssssssssss"+ssmap);

        Map<Integer, String> varargmap1 = MapMethodDeposu.vararglayap(yeniMap22, 3, isim, soyisim,sinif,sube,alan);
        System.out.println(varargmap1);





    }
}
