package day16multidimensionalarraysarraylists;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
// Bir multidimensional array deki en buyuk ve en kucuk elemanin toplamini veren kodu yaziniz

        int arr[][] = { {2, 5, 1}, {83, 75} };
        int minElement=arr[0][0];  //2
        int maxElement=arr[0][0];  //2
        for (int[] w: arr){  //{ {2, 5, 1}, {83, 75} }
            for (int k:w){   // 2, 5, 1,83, 75
                 maxElement=Math.max(maxElement,k); //83
                 minElement=Math.min(minElement,k); //1
            }
         }
        System.out.println(minElement);
        System.out.println(maxElement);
        System.out.println("toplam: "+(minElement+maxElement));

/*
Math.max(2)-> Math.max(2,2)->Math.max(2,5)->Math.max(5,1)->Math.max(5,83)->Math.max(83,75)->83
Math.min(2)-> Math.min(2,2)->Math.min(2,5)->Math.min(2,1)->Math.min(1,83)->Math.min(1,75)->1
 */




    }
}
