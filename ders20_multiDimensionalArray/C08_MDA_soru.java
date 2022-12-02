package ders20_multiDimensionalArray;

import java.util.Arrays;

public class C08_MDA_soru {
    public static void main(String[] args) {

        //Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        // input :     int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output:                      [10, 3, 12, 10, 9]

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int[] output = new int[arr.length];
        int innerArrToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            innerArrToplam = 0;
            for (int j = 0; j < arr[i].length; j++) {
                innerArrToplam += arr[i][j];
            }
            output[i] = innerArrToplam;
        }
        System.out.println(Arrays.toString(output));//[10, 3, 12, 10, 9]
////////////////////////////////////////////////////////////////
        innerToplamlari(arr);
    }

    public static void innerToplamlari(int[][] arr) {

        int[] output = new int[arr.length];
        //{0,0,0,0,0}
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                output[i] = output[i] + arr[i][j];
            }
        }
        System.out.println("metot ile yapılan: "+Arrays.toString(output));
    }
}