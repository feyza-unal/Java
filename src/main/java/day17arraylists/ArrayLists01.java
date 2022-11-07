package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);

        List<String> delNames=new ArrayList<>();

        delNames.add("Tom");
        delNames.add("Thomas");
        delNames.add("Tahsin");
// silmek istediklerimizi yeni bir listeye koyduk
        names.removeAll(delNames);
        System.out.println(names);  //[Trump, Taceddin]
        System.out.println(delNames); //[Tom, Thomas, Tahsin]

// removeAll() kullandığımızda ilk list değişir. parantezin içindeki değişmez

///////////////////////////////////////////////////////////////////////////////////////////////////
        List<String> myNames=new ArrayList<>();
        myNames.add("Trump");
        myNames.add("Taceddin");
        boolean sonuc1=names.containsAll(myNames); // bütün değerler varsa true.
        System.out.println(sonuc1);

///////////////////////////////////////////////////////////////////////////////////////////////////

//EX 1) a listinde "shoes" elemanının ilk görünümünü silin

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        a.remove("Shoes");
        System.out.println(a); //[TV, Radio, Laptop, Shoes, Book, Shoes]

//EX 2) a listinde "shoes" elemanının tüm görünümlerini silin
//removeall da yeni list'e ihtiyacımız var !!!

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);  //[TV, Radio, Laptop, Book]

//EX 3) bir tane salary listi oluşturun eğer salary 10000den az ise %20 10000den çok ve eşit ise %10 zam yapın

        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        System.out.println(salary);  //[12345.0, 8674.5, 15000.75, 9500.0, 20500.0]


        for (Double w: salary){
            if (w<1000){
                salary.set(salary.indexOf(w),w*1.2);
            }else{
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println(salary);  //[13579.500000000002, 9541.95, 16500.825, 10450.0, 22550.000000000004]

//EX 4) İki arraylistin eşit olup olmadığını kontrol eden kodu yazın
//2 array listin eşit olabilmesi için elemanlar eşit olmalı ve aynı elemanlar aynı indexte olmalı
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.yol
        int counter=0;
        for (int i=0; i<m.size(); i++){
           if (m.size() != n.size()){

               counter++;
               System.out.println("listler esit degil");
               break;

           } else if (m.get(i) != n.get(i)){

                counter++;
                System.out.println("listler esit degil");
                break; //bazen break kod hızlansın diye de kullanılır.diğer elemanlara bakmamız gerekmez
            }
        }
        if (counter==0){
            System.out.println("listeler esit");
        }

        //2.yol

        boolean esitMi=m.equals(n);
        if (esitMi){
            System.out.println("listeler esit");
        }else {
            System.out.println("listler esit degil");
        }













    }
}
