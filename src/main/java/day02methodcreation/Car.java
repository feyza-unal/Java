package day02methodcreation;

public class Car {
    public String marka="Honda";
    public int fiyat=20000;
    public void hareketEt(){
        System.out.println("honda konforludur...");
    }
    public void dur(){
        System.out.println("honda güvenli durur...");
    }



    public static void main(String[] args) {
        //object nasıl oluşturulur?
        //1- class ismini yazın
        //2- objeye isim verin
        //3- '=' operatörü
        //4- 'new' keywordunu kullan
        //5- class ismini parantezle yaz

        Car myHonda = new Car();

        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);
        myHonda.hareketEt();
        myHonda.dur();


        MethodCreation obj = new MethodCreation();
        //başka classtan oluşturduk
        System.out.println(obj.toplamaYap(3,5));




    }
}
