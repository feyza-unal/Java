package day22inheritancepolymorphism;

public class HondaAccord extends Honda{
/*
* Siz Class oluşturduğunuzda Java otomatik olarak size görünmez bir constructor verir
  Çünkü Java Classın bir kalıp olduğunu ve Object oluşturmak için yaratıldığını ve Object
  oluşturmak için Constructor'ın şart olduğunu bilir.
* Javanın otomatik olarak oluşturduğu bu görünmez Constructor'a "default Constructor" denir.
* Siz kendiniz herhangi bir Constructor oluşturduğunuzda Java "default Constructor"ı siler.
* Bir Classda birden fazla Constructor olabilir.
* "this" keyword bu Class anlamındadır. "this.price" demek bu Classdaki "price" isimli variable demektir.
* "this.price" syntax'ı Constructor'ların içinde kullanılır.
*  Constructor kullanarak variable'lar üzerinde yaptığınız değişimler sadece Object üzerindeki variable'ların
   degerlerini değiştirir.Class daki variable degerlerini değiştiremez.
*/

//--------------------------------------------------------------------------------------------------------------
    public int price;
    public int year;
    public String make;

    public String model;

    public HondaAccord(){ //görünmez contructor bu şekildedir

    }
    public HondaAccord(int price){
        this.price = price;
    }
    public HondaAccord(int price, int year){
        this.price = price;
        this.year = year;
        System.out.println("honda accord constructor");
    }
    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }

}
