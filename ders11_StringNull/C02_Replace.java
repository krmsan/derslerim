package ders11_StringNull;

public class C02_Replace {
    public static void main(String[] args) {

        String str="Java candır";
        System.out.println(str.replace('a','A'));//JAvA cAndır
        System.out.println(str.replace(' ','_'));//Java_candır
        System.out.println(str.replace("candır","cok guzeldir."));
        System.out.println(str.replace(" ",""));//Javacandır
        System.out.println(str.replace("a",""));//Jv cndır a ları cıkardık

        System.out.println(str.replace("Java","Hava")
                .replace("candır","cok guzel"));// Hava cok guzel yazar

        System.out.println(str.replace("","_"));//_J_a_v_a_ _c_a_n_d_ı_r_
        //1.a yı A yap
        System.out.println(str.replaceFirst("a","A"));//JAva candır


    }
}
