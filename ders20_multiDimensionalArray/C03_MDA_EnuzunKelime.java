package ders20_multiDimensionalArray;

public class C03_MDA_EnuzunKelime {
    public static void main(String[] args) {

        //MDA daki string bir array de en uzun stringi bul
        String [][]arr={{"Ilker","Nesrin"},{"hasan","heysem","Adem","Yusuf Enes"}};

        String enUzunKelime=arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].length()>enUzunKelime.length()){
                    enUzunKelime=arr[i][j];
                }


            }

        }
        System.out.println("en uzun kelime: "+enUzunKelime);
    }
}
