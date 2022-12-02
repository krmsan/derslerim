package ders14_MethodOlusturma;

public class C03_Stringterscevirme {

    //
    //
    public static void main(String[] args) {

        String input = "Java kod yazdıkca ogrenilir";

        System.out.println(stringiTersCevir(input));

    }

    public static String stringiTersCevir(String a) {
        String tersStr = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            tersStr = tersStr + a.charAt(i);

        }

        return tersStr;
    }
}
