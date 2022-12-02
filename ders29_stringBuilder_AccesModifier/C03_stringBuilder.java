package ders29_stringBuilder_AccesModifier;

public class C03_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java ne kadar guzel");
        System.out.println(sb.substring(4));//ne kadar guzel    ama kalıcı olmaz

        //cunku substring string donduruyor

        System.out.println(sb);//Java ne kadar guzel
        //substtring string classından calısır immutable dır

       // sb=sb.substring(0,4); solu stringbuilder sagi ise string tir casting yapamaz non primitiveler

        // Ayni not Integer,Byte ve Short gibi sayi barindiran non-primitive'ler icin de gecerlidir
        // sb guzel kelimesi iceriyor mu ?
        /*
          StringBuilder'da olmayan, String class'inda bulunan method'lari kullanmak isterseniz
          once toString() ile String'e cevirip, sonra String manipulation yapilabilir
         */
        System.out.println(sb.toString().contains("guzel"));//true ToString ile stringe cevirdik
        System.out.println(sb);
        sb.reverse() ;
        System.out.println(sb);//lezug radak en avaJ
        sb.reverse();

        //contains StringBuilderda yoktur  o yuzden to string yapıp kullanabiliriz casting yok ama

        sb.setCharAt(5,'N');//Java Ne kadar guzel      vooid ama sb yapıyor
        System.out.println(sb);
        sb.setLength(8);
        System.out.println(sb);//Java Ne


    }
}
