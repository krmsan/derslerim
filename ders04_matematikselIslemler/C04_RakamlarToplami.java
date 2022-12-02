package ders04_matematikselIslemler;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        System.out.println(8*5+2*(12/4)-19);//27

        //Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim

        int input=1453;//Scanner ile kullanıcıdan da isteyebilirsin


        int birlerbasamagi=0;
        int rakamlarToplami=0;

        birlerbasamagi=input%10;//3
        rakamlarToplami=rakamlarToplami+birlerbasamagi;
        input=input/10;

        birlerbasamagi=input%10;//5
        rakamlarToplami=rakamlarToplami+birlerbasamagi;
        input=input/10;

        birlerbasamagi=input%10;//4
        rakamlarToplami=rakamlarToplami+birlerbasamagi;
        input=input/10;

        birlerbasamagi=input%10;//1
        rakamlarToplami=rakamlarToplami+birlerbasamagi;
        input=input/10;
        System.out.println(rakamlarToplami);//13




    }
}
