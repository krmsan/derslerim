package ders17_Scope;

public class C04_classVariables {
    public static void main(String[] args) {
// C03 deki hastane ismi yazdırmak istersek
        System.out.println(C03_ObjectVariables.hasteneIsmi);//yidiz hastanesi
        System.out.println(C03_ObjectVariables.hastaSayisi);//23453

        C03_ObjectVariables.hastaSayisi++;//
        C03_ObjectVariables.hastaSayisi++;//
        method1();
        C03_ObjectVariables.st();
        System.out.println(C03_ObjectVariables.hastaSayisi);//23456
        C03_ObjectVariables.st();

    }// burda hersey sıfırlanır bastan baslar main method sonu
    public static void method1(){

        C03_ObjectVariables.hastaSayisi++;//

    }

    public void m() {
       // C03_ObjectVariables.persYasi; olmuyor

}
    // java runtime calısır
}
