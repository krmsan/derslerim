package ders18_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        String [] arr = {"Ali","ulus","Nesrin"};

//tum element yaz
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");

        }
        // arrayı array olarak yaz
        System.out.println(arr);//array bir obje non primitive o yuzden referansını yazdırır   [Ljava.lang.String;@39ba5a14

        System.out.println(Arrays.toString(arr));//[Ali, ulus, Nesrin]



    }
}
