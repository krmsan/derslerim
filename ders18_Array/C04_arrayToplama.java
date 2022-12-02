package ders18_Array;

public class C04_arrayToplama {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr = {3, -3, 5, -7, -6, 1, -2};

        System.out.println(pozitifElementleriTopla(arr)); // 9

        int sonuc = pozitifElementleriTopla(arr);//method sadece int di array dönmedi
        System.out.println(sonuc);//9
    }


    public static int pozitifElementleriTopla(int[] arr) {
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }
        }

        return toplam;
    }
}
