package day25exceptions;

public class Exceptions02 {
    public static void main(String[] args) {
        String a[] = {"A","C","B","Z"};
        String r1 = getElement(a,5);
        System.out.println(r1);
    }
    public static String getElement(String a[], int idx){

        String s = "";
        try{
            s = a[idx];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occurred in array indexes");  // benim yazdığım teknik olmayan mesaj
            System.out.println(e.getMessage());  // javanın mesajı (teknik)
            e.printStackTrace();     // Exception ile ilgili detaylica teknik mesaj verir

            // Hata mesajini diger mesajlardan ayirmak icin kullaniriz
            System.err.println("Array index te bir problem yasandi");
        }
        return s;

    }
}
