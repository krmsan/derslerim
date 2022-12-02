package ders19_Array2;

import java.util.Arrays;

public class C04_binarysearch {
    public static void main(String[] args) {
        int[] arr={2,1,2,9,3,2,2,5,3};
        System.out.println(Arrays.binarySearch(arr,8));//7
        System.out.println(Arrays.binarySearch(arr,5));//-2  bulamadı demek  aramaya ortadan baslıyor
        System.out.println(Arrays.binarySearch(arr,1));//0
        System.out.println(Arrays.binarySearch(arr,9));//-10

        //binarysearch metodu sıralı degilse yanlıs sonuc verebilir önce sort() metodu kullanmalısın

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 1, 2, 3, 5, 7, 8, 8, 9]


        System.out.println(Arrays.binarySearch(arr,8));//6
        System.out.println(Arrays.binarySearch(arr,5));//4
        System.out.println(Arrays.binarySearch(arr,1));//1
        System.out.println(Arrays.binarySearch(arr,9));//8
        System.out.println(Arrays.binarySearch(arr,6));//-6 array de olmayan eleman ise - ile verir
        System.out.println(Arrays.binarySearch(arr,100));//-10
        System.out.println(Arrays.binarySearch(arr,10));//-10  sonda demek olsaydı
        System.out.println(Arrays.binarySearch(arr,-3));//-1  olsaydı basta olurdu demek -0 sacma yazım olurdu
    }
}
