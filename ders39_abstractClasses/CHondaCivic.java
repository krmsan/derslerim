package ders39_abstractClasses;

public class CHondaCivic extends BHonda{
    @Override
    public void motor() {
        System.out.println("Honda civic vtec tek. kullnır");
    }

    @Override
    public void kasa() {
        System.out.println("Civic sedan veya Hback kasa olur");
    }

    @Override
    public void tekerlek() {
        System.out.println("civic 205x16x55 teker kullnır");
    }

    @Override
    public void yakit() {
        System.out.println("Civic benzin");
    }

    @Override
    public void guvenlik() {
        System.out.println("Civic araclar guvenlik standardına uyar");
    }

  //  @Override
   // public void abs() {
   //     System.out.println("Honda civic abs kullanır");
   // }

    @Override
    public void kilima() {
        System.out.println("Honda civic klima kullnır");
    }

    public static void main(String[] args) {
        /*

         */
        CHondaCivic civic1=new CHondaCivic();
        civic1.abs();//Araba  //suan Honda
        civic1.kilima();//Araba //suan civic
        civic1.marka();//Honda
        civic1.ozelTeknoloji();//Honda
        civic1.kasa();
    }

}
