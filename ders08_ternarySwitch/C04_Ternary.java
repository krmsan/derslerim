package ders08_ternarySwitch;

public class C04_Ternary {
    public static void main(String[] args) {

        //soru2: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        int k1=10;
        int k2=12;
        int k3=10;

        System.out.println(k1==k2 && k2==k3 ? "eskenar" : "degil");

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        int s1=10;
        int s2=11;

        System.out.println(s1>s2 ? s2 : s1);

    }
}
