package ders11_StringNull;

public class C07_soru {
    public static void main(String[] args) {

        /*Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.

         */
        String isim = "MEhmet";
        String soyIsim = "HAruNGIL";

        String yeniIsimSoy;

        if (isim.length() >= soyIsim.length()) {
            //ilk harf buyuk olsun isim ve soyisim
            yeniIsimSoy = isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyIsim.substring(0, 1).toUpperCase() +
                    soyIsim.substring(1).toLowerCase();

        } else {
            //isim ilk harf buyuk soyisim hepsi buyuk

            yeniIsimSoy = isim.substring(0, 1).toUpperCase() +
                    isim.substring(1).toLowerCase() +
                    " " +
                    soyIsim.toUpperCase();
            System.out.println(yeniIsimSoy);


            //isim.substring(1).toLowerCase(); bunu yazar
            //isim.charAt().toLo     ikinci metotu almıyor charAt
        }
    }
}
