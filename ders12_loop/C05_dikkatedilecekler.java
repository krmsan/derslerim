package ders12_loop;

public class C05_dikkatedilecekler {
    public static void main(String[] args) {

        for (int i = 1; i >10; i++){
            System.out.println("bisey yazmaz"+i);// kod calısır ama ilk sart saglanmadı bisey yazmaz
        }
        // sayı asal mı
        int sayi=347;
        boolean asalMi=true;
        // int bayrak =0;

        for (int i =2; i <sayi; i++){

            if (sayi% i ==0){
                asalMi=false;  // yazmak sart
                break; // sart degil
                //bayrak++;
                //break;
            }
        }
        if (asalMi==true){
            System.out.println("asal");
        }else {
            System.out.println("degil");
        }

        System.out.println(asalMi==true ?"asal" : "degil");
        //System.out.println(bayrak);


       /* if (bayrak==0){
            System.out.println("asal");
        }else {
            System.out.println("degil");
        }

        */
    }
}
