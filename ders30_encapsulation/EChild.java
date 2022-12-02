package ders30_encapsulation;

public class EChild  extends DParent{

    //extend keyword
    //EChild extend DParent yazarız

    public static void main(String[] args) {
       EChild child1 =new EChild();
       child1.yas=30;
        System.out.println(child1.yas);//30

       DParent parent=new DParent();
       parent.yas=35;
        System.out.println(parent.yas);//35
        System.out.println(child1.yas);//30
        //farklı objeler olusturduk cunku

        child1.isim="mahmut";
        child1.isEnough=false;



    }
}
