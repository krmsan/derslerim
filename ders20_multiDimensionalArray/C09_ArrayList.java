package ders20_multiDimensionalArray;

import ders18_Array.C06_KullaniciyaArrayOlusturma;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        C06_KullaniciyaArrayOlusturma obj1=new C06_KullaniciyaArrayOlusturma();


        List<Integer> sayilar=new ArrayList<>();
        //list primitive kabul etmez
        // interface dir direk obje olusturulmaz
        //onunyerine sag tarafa ArrayList<>() yazarız

        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar);//[4, 5]

        arrMethodDondur();
        System.out.println(Arrays.toString(arrMethodDondur()));//[1, 2]
        System.out.println(Arrays.deepToString(multiArrMethodDondur()));//[[1, 2], [3, 4]]
    }
    public static int[] arrMethodDondur(){
       int[] x={1,2};
        return x;
    }
    public static int[][] multiArrMethodDondur(){
        int[][] x={{1,2},{3,4}};
        return x;
    }
}
