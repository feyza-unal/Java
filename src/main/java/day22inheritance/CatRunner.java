package day22inheritance;

public class CatRunner {
    public static void main(String[] args) {
/*
* Javada object oluştururken Constructorlar Parent dan Childa doğru çalışır
* Java en üst Parent Constructor'a çıkabilmek için "super()" kodunu kullanır
* "super()" kodu her Constructor'ın "ilk satırında gizli" olarak bulunur
* "super()" kodunu isterseniz görünür şekilde de yazabilirsiniz
* "super()" kodunu görünür şekilde yazarsanız, ilk satır dışında başka bir satıra koymayınız
* "super()" kodu Parent Classtan Constructor çağırmaya yarar
 */

//--------------------------------------------------------------------------------

        Cat cat1 = new Cat();
        // cat yaratmak istediğimizde önce animal-> manimal-> cat yaratıldı
        // constructor lar yukardan aşağıya çalışır (parent -> child)
    }
}
