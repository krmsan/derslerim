package ders19_Array2;

import java.util.Arrays;

public class C08_ArrayeelemanEklemeMethodu {
    public static void main(String[] args) {
        //eleman ekle ve yeni halini bize dondur
        int[] abc={3,5,8,9};
        int eklenecekSayi=10;

        abc=arrayeelemanEkle(abc,eklenecekSayi);
        System.out.println(Arrays.toString(abc));//3, 5, 8, 9, 10]

    }
    public static int[] arrayeelemanEkle(int[]eklenecekArr,int ekleneceksayi){
        int[] yeniArr=new int[eklenecekArr.length+1];
        for (int i = 0; i < eklenecekArr.length; i++) {
            yeniArr[i]=eklenecekArr[i];


        }
        yeniArr[yeniArr.length-1]=ekleneceksayi;
        return yeniArr;
    }
}
