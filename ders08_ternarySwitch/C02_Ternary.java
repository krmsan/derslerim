package ders08_ternarySwitch;

public class C02_Ternary {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        //aynı iseler "metinler aynı" yaz degilse farklı yaz

        str1=str1.toLowerCase();
        System.out.println(str1);


        if (str1.equals(str2)){
            System.out.println("metinler aynı");
        }else {
            System.out.println("farklı");
        }
        System.out.println(str1.equals(str2) ? "metinler aynı" : "metinler farklı");//ternary

    }
}
