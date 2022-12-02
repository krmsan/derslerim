package ders18_Array;

public class C07_EnKisa_EnUzunKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] arr ={"Hasan", "Ilker","Senturk","Omer Faruk"};
        enUzunEnKisaIsimleriYazdir(arr);
        String[] arr2 ={"Has", "Ilker","Sent","Omer"};
        enUzunEnKisaIsimleriYazdir(arr2);
        String[] arr3 ={"Hasan", "Ilker","Sem","ali"};
        enUzunEnKisaIsimleriYazdir(arr3);
    }

    public static void enUzunEnKisaIsimleriYazdir(String[] arr){

        String enuzunKelime=arr[0];
        String enKisaKelime=arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if (arr[i].length()>=enuzunKelime.length()){
                enuzunKelime=arr[i];
            }

            if (arr[i].length()<=enKisaKelime.length()){
                enKisaKelime=arr[i];
            }
        }
        System.out.println("En uzun isim : " + enuzunKelime);
        System.out.println("En kisa isim : " + enKisaKelime);
    }
}
