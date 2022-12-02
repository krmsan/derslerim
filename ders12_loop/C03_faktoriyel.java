package ders12_loop;

public class C03_faktoriyel {
    public static void main(String[] args) {


        // faktoryel,n, bul
        int sayi =5;
        int faktoyel=1;
        for (int i =sayi;  i>=1; i--){
            faktoyel=faktoyel*i;
            System.out.println("rere"+faktoyel);
        }
        sayi=5;
        faktoyel =1;

        for (int i =sayi;  i>=1; i--){
            faktoyel=faktoyel*i;
        }
            System.out.println(" we"+faktoyel);

        //1 100 top
        int toplam=0;
        for (int i = 1; i <=100 ; i++){
            toplam=toplam+i;
            //toplam=toplam+1;
          //int  x=toplam;
           // System.out.println(x); 100 yazar
        }
        System.out.print(toplam);//5050


    }
}
