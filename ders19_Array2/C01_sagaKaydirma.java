package ders19_Array2;

import java.util.Arrays;

public class C01_sagaKaydirma {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};
        arr = sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] sagaKaydir(int[] ar) {

        int bosKova = ar[ar.length - 1];//son elementi bos kovaya koyduk

        for (int i = ar.length - 2; i >= 0; i--) {

            ar[i + 1] = ar[i];
        }
        ar[0] = bosKova;
        return ar;
    }


}
