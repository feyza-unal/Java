package day26exceptions;

public class Exceptions04 {
    public static void main(String[] args) {

        int age  = 250;
        try {
            printAge(age);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    //Yas'i ekrana yazdiran bir method olusturunuz
    public static void printAge(int age){
        if(age<0 || age>200) {
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den buyuk olamaz"); // exception'ı vermesini kendimiz istedik
            //  cunku kullanicinin negatif yada 200den buyuk yas girdiginde programin çalısmayı durdurmasi gerek.
        }
        System.out.println(age);
    }
}
