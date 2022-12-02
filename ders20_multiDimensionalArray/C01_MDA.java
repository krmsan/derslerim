package ders20_multiDimensionalArray;

import java.util.Arrays;

public class C01_MDA {

    public static void main(String[] args) {

        int[][] arr = {{4, 3, 1}, {1}, {5, 6, 7}, {}, {3, 6, 8, 0}};

        int[] arr2 = arr[1];

        System.out.println(arr2[0]);//1
        System.out.println(arr.length);//5
        System.out.println(arr[2].length);//3

        System.out.println(arr[1]);// direkt yazdırılamaz referans yazar inner Array  [I@4cdbe50f

        System.out.println(Arrays.toString(arr[1]));//[1] yazar

        System.out.println(Arrays.deepToString(arr));//[[4, 3, 1], [1, 2], [5, 6, 7], [3, 6, 8, 0]]

        //System.out.println(arr[3][0]);//ArrayIndexOutOfBoundsException
        System.out.println(arr[2][0]);//5

    }
}
