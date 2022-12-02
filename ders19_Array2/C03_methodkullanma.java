package ders19_Array2;

import ders18_Array.C03_arrayElementleriniArtirma;
import ders18_Array.C04_arrayToplama;
import ders18_Array.C05_ArraydeElemanArama;
import ders18_Array.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_methodkullanma {
    public static void main(String[] args) {



    /*
    arr= C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr)); // [4, 5, 6]

        System.out.println(C04_ArrayElementleriToplama.pozitifElementleriTopla(arr)); // 15

        C05_ArraydeElemanArama.elemanAra(arr,10); // Aranan sayi array'de yok

    int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));

     */
        // verilen bir int array'in elementlerini 2 artirin
        int[] arr = {2, 3, 4};
        arr= C03_arrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));// [5, 6, 7]         ****int [] *****


        // arr array'inin elementlerini toplayip sonucu yazdirin
        System.out.println(C04_arrayToplama.pozitifElementleriTopla(arr));//18    **** int ****

        // arr array'inde 10 element olarak var mi ?
        C05_ArraydeElemanArama.elemanAra(arr,10);//Aranan sayi array'de yok    **** VOİD ****

        // kullanicidan deger alarak bir array olusturun
        int[] yeniArr= C06_KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));   //   boyut gir      ***** int [] ******
        System.out.println(Arrays.toString(C06_KullaniciyaArrayOlusturma.arrayOlustur()));//ustteki ile aynı




    }
}
