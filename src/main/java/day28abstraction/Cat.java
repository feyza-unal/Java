package day28abstraction;

public class Cat extends Mammal{ // bunu da abstract yapmak yerine override edelim
  /*
  Bir method "parent class" da abstract ise ;
  Child class o methodu "override" edip kullanmak zorundadir.
  Bu yuzden her hangi bir fonksiyonu "child class" icin mecburi yapmak
  isterseniz o methodu "abstact" method yapmalisiniz.
   */


    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }


}
