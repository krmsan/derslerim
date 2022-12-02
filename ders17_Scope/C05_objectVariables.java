package ders17_Scope;

public class C05_objectVariables {
    public static void main(String[] args) {

        C03_ObjectVariables pers1 =new C03_ObjectVariables();
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);

        pers1.persIsmi="ali";
        pers1.persYasi=25;
        System.out.println(pers1.persIsmi);
        System.out.println(pers1.persYasi);


        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.persIsmi="veli";
        pers2.persYasi=35;

        System.out.println(pers2.persIsmi);
        System.out.println(pers2.persYasi);

        C03_ObjectVariables pers3 =new C03_ObjectVariables();
        pers3.persIsmi="ayse";
        pers3.persYasi=34;
        pers3.perstelefonu="5556547377";

        System.out.println(pers3.persIsmi);
        System.out.println(pers3.persYasi);
        System.out.println(pers3.perstelefonu);


    }
}
