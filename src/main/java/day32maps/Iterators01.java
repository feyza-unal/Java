package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // for-each loop kullanarak elemanin sonuna "!" ekleyiniz
        //Note: loop'lar kendi baslarina "collection"lari update edemezler. bu yuzden java "iterator"lari olusturdu
        // iterator lar collectionlari update etmek icin kullanilir
        //hasNext() methodu pointerdan sonra eleman varsa "true" yoksa "false" return eder
        //nex() methodu pointer'i bir sonraki elemanin onune koyar ve ustunden atladigi elemani return eder
        //hasPrevious() methodu pointerdan once eleman varsa "true" yoksa "false" return eder
        //previous() methodu pointer'i bir onceki elemanin sonuna koyar ve ustunden atladigi elemani return eder

        for (String w:myList) {
            w = w+"!";
        }
        System.out.println(myList); //[Z, K, A, J, M]

        ListIterator<String> itr = myList.listIterator();
        while (itr.hasNext()) {
            String el = itr.next();
            itr.set(el+"!");
        }
        System.out.println(myList); //[Z!, K!, A!, J!, M!]




    }
}
