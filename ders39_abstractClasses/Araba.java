package ders39_abstractClasses;

public abstract class Araba {

    public abstract void motor();
    public abstract void marka();
    public abstract void kasa();
    public abstract void tekerlek();//{} olmazlar
    public  void abs(){
        System.out.println("guvenlik için abs olamli");
    };//overrride edilsin childlardan
    public  void kilima(){
        System.out.println("konfor icin kilima olmali");
    };//obsiyonel olsun

}
