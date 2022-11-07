package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
        1)Farkli sayilardaki parametrelerle calisabilen bir method
          olusturmak isterseniz "varargs" kullanmalisiniz.

        2) "varargs" arka tarafta "Array" kullanir. Bu yuzden
           "varargs" larla calisirken "Array" lerle calisiyormus gibi
           davranabilirsiniz.

        3) "varargs" olusturmak icin "<data type>...  <varargs ismi>"
        veya "<data type>  ...<varargs ismi>"

        4)Bir method'da "varargs" in yaninda baska bir parametre
          kullanilabilir mi?
          "varargs" en sonda olmak sarti ile kullanilir. -> int add(String s,int...a)

        5)Bir method'da birden fazla "varargs" kullanilabilir mi?
        "varargs" en sonda olmak zorunda oldugundan birden fazla
        kullanirsaniz en az biri en sonda olmayacaktir. Bu da 4. kural
        ile celisir.

     */
// istediğimiz kadar sayıyı toplayabileceğimiz bir method oluşturun
    public static void main(String[] args) {

        int r1=add(2,3);
        System.out.println(r1);  //5
        int r2=add(2,3,4);
        System.out.println(r2);  //9
        int r3=add(2,3,4,10,20,50);
        System.out.println(r3);  //89

    }
     public  static  int add(int...a){
        int sum = 0;
        for(int w:a){
            sum = sum + w;
        }
        return sum;
     }

}

