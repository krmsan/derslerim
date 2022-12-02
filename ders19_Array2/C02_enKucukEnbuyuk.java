package ders19_Array2;

import java.util.Arrays;

public class C02_enKucukEnbuyuk {
    public static void main(String[] args) {
        // Verilen bir int array'de en kucuk ve en buyuk sayilari
// yazdiran bir method olusturun

        int[] arr={3,8,1,5,2,9};

        enBuyukEnKucukElementYazdir(arr);//
    }
    public static void enBuyukEnKucukElementYazdir(int[] ar){
        Arrays.sort(ar);
        System.out.println("en buyuk element :"+ ar[ar.length-1]);
        System.out.println("en kucuk element ;"+ ar[0]);



    }
}
