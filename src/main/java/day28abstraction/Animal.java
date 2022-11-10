package day28abstraction;

public abstract class Animal {
    // body'si olmayan methodlar abstract method olarak adlandirilir
    // bir methodu abstract yapmak icin i) method body'i sil ii) "abstract" keyword kullan
    // abstract methodlar "abstract class" icinde olmalidir
    public abstract void eat();

    // "abstract classlar"da hem abstract hem de "concrete" (non-abstract) method kullanilabilir
    public void drink(){
        System.out.println("Animal drink...");
    }

    // abstract "move" method olusturunuz
    public abstract void move();
}
