package ders19_Array2;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        String str ="java";
        str ="hava";
        String [] arr1={"Ali","Veli"};
        String [] arr2={"A","B","C"};
        arr1=arr2;
        System.out.println(Arrays.toString(arr1));//[A, B, C]
        //var olan bir array i yeni deger olarak atayabiliriz

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]

        // arr1={"a","b"};  BOYLE YAZAMAYIZ deger degistirilemez


    }
}
