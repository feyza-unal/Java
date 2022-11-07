package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {

 // EX 1) verilen bir listteki elemnları tekrarsız olarak yazınız
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]

        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);

        List<Integer> yeni = new ArrayList<>();

        for (Integer w:a){
            if (!yeni.contains(w)){
                yeni.add(w);
            }
        }

        System.out.println(yeni);

//EX 2) kullanıcıdan bir harf alınız. harf sizdeki listin içinde varsa o harfi "bulundu" ya çevirin yoksa
//        o harfi liste ekleyiniz [A,K,R,S] ->R ->[A,K,Bulundu,S]
//                               [A,K,R,S] ->X ->[A,K,R,S,X]

        Scanner input=new Scanner(System.in);

        List<String> c = new ArrayList<>();
        String harf="";
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");

        do {
        System.out.println("bir harf girin:");
        harf=input.next().substring(0,1).toUpperCase();

        if (c.contains(harf)){
            c.set(c.indexOf(harf),"bulundu");
        }else if(!harf.equals("Q")){
            c.add(harf);
        }
        }while (!harf.equals("Q"));

        System.out.println(c);














    }
}
