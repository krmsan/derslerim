package ders18_Array;

public class C05_ArraydeElemanArama {

    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de istenen bir elemanin
        // var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman= 2;

        elemanAra(arr,arananEleman);//3   Void idi yazdırma voidin içinde


    }

    public static void elemanAra(int[] ar, int arananE){

        int sayac=0;

        for (int i = 0; i < ar.length ; i++) {

            if (ar[i]==arananE){
                sayac++;
            }

        }

        if (sayac==0){
            System.out.println("Aranan sayi array'de yok");
        }else{
            System.out.println("Aranan " + arananE + " sayisi, array'de " + sayac + " kere kullanilmis");
        }
    }
}
