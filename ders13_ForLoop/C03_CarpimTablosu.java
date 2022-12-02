package ders13_ForLoop;

public class C03_CarpimTablosu {
    public static void main(String[] args) {
//1-4 arası carpım tablosu
        // dis dongu satırları

        for (int i = 1; i <=4 ; i++) {
            // ic dongu her satırda olan ları takip eder

            for (int j = 2; j <=3 ; j++) {
                System.out.print(i*j+" ");
            }
            //ic dongu bittiginde alt satıra indirmeliyiz
            System.out.println("");
        }
    }
}
