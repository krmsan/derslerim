package ders10_stringManipulations;

public class C07_soru {
    public static void main(String[] args) {

        /*
        metin al
        metni icermiyor
        bir kere iceriyor
        birden fazla iceriyor
         */
        String cumle="Java cok guzeldir cok";
        String metin="cok";
        if (!cumle.contains(metin)){
            System.out.println("cumle metin icermiyor");
        }else {
            int ilkIndex=cumle.indexOf(metin);//5
            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);// ya -1 ya da bir index

            if (ikinciIndex==(-1)){
                System.out.println("cumle metni bir kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }


        }



    }
}
