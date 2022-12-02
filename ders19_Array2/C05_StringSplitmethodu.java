package ders19_Array2;

import java.util.Arrays;

public class C05_StringSplitmethodu {
    public static void main(String[] args) {
        String str = "Java gercekte cok guzel";
        //kac tane e var


        String[] eArrayi = str.split("e");//
        System.out.println(Arrays.toString(eArrayi));//[Java g, rc, kt,  cok guz, l]
        System.out.println(eArrayi.length);//5

        System.out.println("e adedi: " + (eArrayi.length - 1));//4

        //2. yontem

        String[] tumkarakter = str.split("");
        System.out.println(Arrays.toString(tumkarakter));
        //[J, a, v, a,  , g, e, r, c, e, k, t, e,  , c, o, k,  , g, u, z, e, l]

        int sayac = 0;
        for (int i = 0; i < tumkarakter.length; i++) {
            if (tumkarakter[i].equals("e")) {
                sayac++;
            }
        }
        System.out.println("sayac:"+sayac);//4




    }
}
