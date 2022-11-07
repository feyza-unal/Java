package day22inheritance;

public class Runner {
    public static void main(String[] args) {
/*
* Inheritance da "variable'lar seçilirken java Object data tipine" bakar.
* Oncelikle istediğiniz variable'ı Object'in data tipi olan Class da arar
* O Class da bulamazsa Parent Classlara bakar
* Hiç bir Parent Classda bulamazsa hata verir.
*/
//--------------------------------------------------------------------------------

        Cat cat1 = new Cat();
        System.out.println(cat1.a); //14
        System.out.println(cat1.b); //34
        System.out.println(cat1.c); //45

        Mammal cat2 = new Cat();
        System.out.println(cat2.a); //13

        Animal cat3 = new Cat();
        System.out.println(cat3.a); //12

//--------------------------------------------------------------------------------
/*
* Object oluşturuken Objectin data tipi Child Classlardan seçilemez.
* Inheritance da "method'lar seçilirken Java Constructor'a" bakar.
* Oncelikle istediğiniz methodu Constructori kullanılan Classdan alır
* O Class da bulamazsa Parent Classlara bakar
* Hiç bir Parent Classda bulamazsa hata verir.
*/
        Cat cat4 = new Cat();
        cat4.eat(); //cat eat
        cat4.drink(); //Mammal drink

        Mammal cat5 = new Mammal();
        cat5.eat(); //Mammal eat

        Animal cat6 = new Animal();
        cat6.eat(); //Animal eat

//--------------------------------------------------------------------------------



    }
}
