package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

//Eger iki tarafli haraket etmek istemiyorsan Iterator
//Eger list elemanlarinin degistirilmesini istemiyorsak Iter
//Eger sadece silmek istemiyorsani Iterator
/*
    1) ListIterator da i)hasNext() ii)next() iii)set() iv)hasPrevious() v)previous() vi)remove() method'ları vardır.

    2) Iterator'da i)hasNext() ii)next() iii)remove() method'ları vardır.
 */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //Example 1: Iterators kullanarak List elemanlarini tersten consol'a yazdirin

        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()) {
            itr.next();
        }// pointer en saga gelmis oldu

        while (itr.hasPrevious()){
            String el = itr.previous();
            System.out.print(el + " ");
        } //M J A K Z

        //Example 2: List'deki tum elemanlari siliniz.
        while (itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(myList); //[]


        List<String> yourList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");
        Iterator<String> iterator = yourList.iterator();
        while(iterator.hasNext()){
            String el = iterator.next();
            System.out.print(el);
        }



    }


}
