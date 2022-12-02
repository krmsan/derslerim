package ders11_StringNull;

public class C04_ReplaceAll {
    public static void main(String[] args) {

        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli

        String input = "Ja5+va cok 1*guzel_";

        input=input.replaceAll("\\W","");//Ja5+vacok1*guzel_
        //input=input.replaceAll("\\d","");//Javacokguzel
        System.out.println(input.replaceAll("\\w",""));//Javacokguzel_
        System.out.println(input);
        input=input.replaceAll("\\d","");// //Ja+va cok *guzel_
        System.out.println(input);
        input=input.replace(" ","5");
        System.out.println(input);
        input=input.replaceAll("\\W","");////Java5cok5guzel_
        System.out.println(input);
        input=input.replace("5"," ");
        System.out.println(input);
        input=input.replace("_"," ");
        System.out.println(input);

input = "sat_  12*?";
        System.out.println(input.replaceAll("\\w","_"));//____  __*?
        System.out.println(input.replaceAll("\\W",""));//sat_12
    }
}
