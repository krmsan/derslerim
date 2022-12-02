package ders13_ForLoop;

public class C01_ {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin

        String input = "Java";
        for (int i = input.length() - 1; i >= 0; i--) {
           // input = ""+input+""+input.charAt(i);
            System.out.println(input.charAt(i));
           // System.out.println(input);
        }
        //System.out.println(input.charAt(i));   i ne der
        System.out.println(input);
    }
}
