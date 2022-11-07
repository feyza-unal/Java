package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

// EX 1) bir listteki elemanlardan birbirine en yakın olan ikisini bulun
//       [12,15,19,30,21] ->19 ve 21

        List<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

        Collections.sort(a);  //küç->büy sıraladık. collectionsa gidip yapıyoruz
        int minFark=Integer.MAX_VALUE;  // int için olabilecek en büyük değeri verdik. listteki sayının çok büyük olma ihtimaline karşı
        for (int i=1; i<a.size();i++){
            minFark=Math.min(minFark,a.get(i)-a.get(i-1));
        }
        System.out.println(minFark);  //2







    }
}
