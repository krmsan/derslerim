package ders05_concatination_operatorler;

public class C01_Concatenation {
    public static void main(String[] args) {
        System.out.println("" + 3 + 5);//35
        String s1 = "Java";
        String s2 = "guzeldir";
        String s3 = "";
        String s4 = " ";
        int sayi1 = 4;
        int sayi2 = 3;
        System.out.println(s1 + s4 + s2 + (sayi1 + sayi2));//java guzeldir7

        //java guzeldir 12
        System.out.println("" + (sayi2 + sayi1) + s1 + s4 + s2 + s4);//7java guzeldir
        System.out.println("" + sayi2 + sayi1 + s1 + s4 + s2 + s4);//34java guzeldir

        System.out.println(s1 + s4 + s2 + s4 + (sayi1 * sayi2));//Java guzeldir 12

        System.out.println(s1 + s4 + s2 + s4 + sayi1 * sayi2);//aynısı işlem önceliğinden


    }
}
