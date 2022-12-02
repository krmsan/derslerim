package ders18_Array;

import java.util.Arrays;

public class C03_arrayElementleriniArtirma {

    public static void main(String[] args) {
        //Soru 1- Verilen bir int array’in tum elemanlarini 3 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kayded

        int[] arr = {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;

        }
        System.out.println(Arrays.toString(arr));//[4, 6, 8, 10]


        arr = elementleri2Artir(arr);//metootu arr ye atadık yani kaydettik array döndürüyor

        System.out.println(Arrays.toString(arr));//[7, 9, 11, 13]

        System.out.println(elementleri2Artir(arr));//[I@4cdbe50f referansı eger arr array olmasaydı yazardı

    }

    public static int[] elementleri2Artir(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            ar[i] = ar[i] + 3;
        }
        return ar;
    }
}

