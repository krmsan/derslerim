package ders39_abstractClasses;

public abstract class BHonda extends Araba{

    //1) ya clası abstract yaparsın gerekiyorsa projede
    //2) ya da abstract methodları override edersin

    public void marka(){//concrete edildi abstract degil artık
        System.out.println("marka : Honda");
    }
    public abstract void yakit();
    public abstract void guvenlik();
    public void ozelTeknoloji (){
        System.out.println("tum honda arablar vtec tekn. kullanır");
    };

    public  void abs(){
        System.out.println("tum hondalarda guvenlik için abs olamli");
    }
}
