package ders45_maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethodDeposu {

    static String isim = "";
    static String soyisim = "";
    static String sube = "C";
    static String sinif = "9";
    static String alan = "fen";
    static String tekvalue = isim + "-" + soyisim + "-" + sube + "-" + sinif + "-" + alan;
    static Integer key = 1;

    public static Map<Integer, String> yeniMapOlusturduk() {
        Map<Integer, String> yeniMap = new HashMap<>();
        for (int i = key; i < 4; i++) {
            yeniMap.put(key, tekvalue);
            key++;
        }

        return yeniMap;
    }

    public static Map<Integer, String> omapOlustur2() {

        Map<Integer, String> yeniMap = new HashMap<>();
        yeniMap.put(1, "a-b-c-d-11");
        yeniMap.put(2, "e-f-g-h-12");
        yeniMap.put(3, "j-k-l-m-13");

        return yeniMap;
    }


    public static String isim(Map<Integer, String> yeniMap, int no) {

        String is = yeniMap.get(no);//a-b-c-d-11
        String[] isarr = is.split("-");
        String isim = isarr[0];

        return isim;
    }


    public static String isimdegis(Map<Integer, String> yeniMap22, int no, String yeniisim) {
        String mapstr = yeniMap22.get(no);
        String[] strarr = mapstr.split("-");

        strarr[0] = yeniisim;
        strarr[1] = "asd";

        String yenistr2 = "";

        //yeniMap22.put(no,yeniMap22.)

        for (String eachstring : strarr

        ) {

            yenistr2 += eachstring + "-";
        }


        yeniMap22.put(no, yenistr2);
        return yenistr2;
    }


    public static Map<Integer, String> isimdegismap(Map<Integer, String> yeniMap22, int no, String yeniisim) {
        String mapstr = yeniMap22.get(no);
        //mapstr=mapstr.replaceAll("11","cevat");bu dinamik degil
        //elle degistirmek gibi.11 varmı bilmeyebiliriz

        if (yeniMap22.containsKey(no)) {
            String[] strarr = mapstr.split("-");
            strarr[0] = yeniisim;

            String yenistr2 = "";
            for (int i = 0; i < strarr.length; i++) {
                if (i < strarr.length - 1) {
                    yenistr2 += strarr[i] + "-";
                } else yenistr2 += strarr[i];
            }

            yeniMap22.put(no, yenistr2);
        }

        return yeniMap22;
    }

    public static Map<Integer, String> vararglayap(Map<Integer, String> yeniMap22, int no, String... var) {
        String mapigetir = yeniMap22.get(no);
        String[] maparr = var;
        String mapstr = "";
        for (String each : maparr
        ) {
            mapstr += each;
        }

        yeniMap22.put(no, mapstr);
        return yeniMap22;

    }



    public static Map<Integer, String> elementdegistir(Map<Integer, String> sonmap, int no, String... element) {
        String mapstr = sonmap.get(no);
        //mapstr=mapstr.replaceAll("11","cevat");bu dinamik degil
        //elle degistirmek gibi.11 varmı bilmeyebiliriz

        if (sonmap.containsKey(no)) {
            String[] strarr = mapstr.split("-");
            strarr[0] = element[0];
            strarr[1] = element[1];
            strarr[2] = "sssssssssss";
            strarr[3] = sube;
            /*
             strarr[0] = isim;
            strarr[1] = soyisim;
            strarr[2] = sinif;
            strarr[3] = sube;
            strarr[4] = alan;
             */

            String yenistr2 = "";
            for (int i = 0; i < strarr.length; i++) {
                if (i < strarr.length - 1) {
                    yenistr2 += strarr[i] + "-";
                } else yenistr2 += strarr[i];
            }
        }
        return sonmap;
    }
}
