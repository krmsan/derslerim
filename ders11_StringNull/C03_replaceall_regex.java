package ders11_StringNull;

public class C03_replaceall_regex {

    public static void main(String[] args) {

        String str="J1ava2 G9uzeldir8";

        // metni duzeltelim
        //str.replaceAll() sadece bir harf degil veya char sequence
        //otak ozelllikteki tum karakterleri degistiri tum sayıları mesala

        System.out.println(str.replaceAll("\\d",""));//Java guzeldir
        System.out.println(str.replaceAll("\\D",""));//1298

        String s1="ilk urun:1250 tl";
        String s2="ikinci urun:1500 tl";
        //ikisini topla
        s1=s1.replaceAll("\\D","");// "1250"
        s2=s2.replaceAll("\\D","");//"1500"
        System.out.println(s1+s2);//12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750





    }
}
