package day13loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
 /*
 aynı data tipinde çoklu datayı depolamak için javanın oluşturduğu yapılar vardır.
 bu yapılardan biriside array'lerdir
  */
        int stdAges[]= new int[7]; // [0,0,0,0,0,0,0]  -> array oluşturma
        System.out.println(Arrays.toString(stdAges)); //-> array yazdırma

//array e eleman ekleme
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;

        System.out.println(Arrays.toString(stdAges)); //-> array yazdırma
        System.out.println(stdAges[4]);

//Ex1: arraydeki en küçük ve büyük elemanın toplamını ekrana yazdırın

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);

// lenght parantez ile  stringlerde, parantezsiz olarak arraylerde kullanılır

//Ex2: stdAges arrayindeki tüm elemanların toplamını ekrana yazdırın

        int sum=0;
        for (int i=0; i< stdAges.length; i++){
            sum=sum+stdAges[i];
        }
        System.out.println(sum);

//2. yol while
        int k=0;
        int top=0;
        while(k< stdAges.length){
            top=top+stdAges[k];
            k++;
        }
        System.out.println("toplam: "+top);

//3. yol do while
        int top2=0;
        int x=0;
        do {
            top2 =top2+stdAges[x];
            x++;
        }while (x<stdAges.length);
        System.out.println(top2);

//4.yol for each loop en gelişmiş looptur. arraylerde ve collectionslarda kullanılır
// ilk önce arrayin data tipi sonra genelde 'w' kullanılır.sonra arrayin adı yazılır

        int t=0;
        for (int w:stdAges){
            t=t+w;
        }
        System.out.println(t);

//Ex3: String bir array oluşturun
//      bu arraye 5 tane isim yerleştirin
//      bu isimlerdeki karakter sayiların toplamını yazdırın

        String stdNames[]=new String[5];
        stdNames[0]="Ali";
        stdNames[1]="Tom";
        stdNames[2]="Veli";
        stdNames[3]="kemal";
        stdNames[4]="cem";

        int karakterSayTop=0;
        for (String w: stdNames){
            karakterSayTop=karakterSayTop+w.length();
        }
        System.out.println(karakterSayTop);

//Ex4: char bir array oluşturun. bu arraye 5 eleman ekleyin.bu arraydeki sadece büyük harfleri ekrana yazdırın

        char ch[]={'A','c','D','k','m'};
        for (char w:ch){
            if (w>='A' && w<='Z'){
                System.out.print(w);
            }
        }


    }

}
