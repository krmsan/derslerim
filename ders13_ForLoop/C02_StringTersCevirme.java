package ders13_ForLoop;

public class C02_StringTersCevirme {
    public static void main(String[] args) {
//Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
//kaydedin.

        String input = "Java her ";
        String tersInput = "";
        for (int i = input.length()-1; i >=0 ; i--) {
          tersInput += input.substring(i,i+1);
            //System.out.println(tersInput);
        }
       // System.out.println(tersInput);//royısalroz nug neceg reh avaJ


        for (int i = input.length()-1; i >=0 ; i--) {
            tersInput =tersInput + input.substring(i,i+1);
            //System.out.println(tersInput);
        }
        System.out.println(tersInput);

       // input=input-(input.length()-1); böyle bişey yapılabilir mi

    }
}
