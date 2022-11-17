package day32maps;

public class StaticBlocks01 {

    public static double pi;

    //static block'lar ihtiyacimiz olan variable'larin class olusturma safhasinda elimizde olmasini saglar

    static {
        pi = 3.14;
    }

    public static void main(String[] args) {

    }


}
