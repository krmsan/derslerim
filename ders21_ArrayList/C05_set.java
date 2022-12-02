package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,1,1,1,2,2,2,4,3,4,4,};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

                sayilar.add(arr[i]);
        }
        sayilar.set(0,8);//0. indexi 8 yap
        System.out.println(sayilar.set(2, 9));//3

        int eskideger=sayilar.set(1,9);
        System.out.println(sayilar.set(1,9));//9
        System.out.println(sayilar);//[8, 9, 9, 4, 5, 6, 7, 1, 1, 1, 2, 2, 2, 4, 3, 4, 4]
///////////////////////////////////////////////////////////////////////////////////////////////

        sayilar.remove(0);//0. indexi kaldırır
        Integer silinecekobje=4;
        sayilar.remove(silinecekobje);//ilk 4 u  siler
        System.out.println(sayilar);
        // tum 4 leri silelim
        while (sayilar.contains(silinecekobje)){
            sayilar.remove(silinecekobje);//boolean bunu içeri yazsaydık bulamayınca ne yapardı while
        }
        System.out.println(sayilar);//[9, 9, 5, 6, 7, 1, 1, 1, 2, 2, 2, 3]
        System.out.println(sayilar.remove(silinecekobje));//false
       // System.out.println(sayilar.remove(20));//IndexOutOfBoundsExceptio
    }

    static int arr[] = {1,2,3,4,5};
    public static int set(int index, int a){
        int tmp= arr[index];
        arr[index] = a;

        return tmp;
    }

    public static String set (int index,String a){


        return a;
    }
    public static int uzunlugunuHesapla(int a,String b){


        return a;
    }
    public static String uzunlugunuHesapla(byte a){


        return "sss";
    }
    public static int uzunlugunuHesapla(String a,int c){


        return a.length();
    }
}
