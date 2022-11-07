package day12loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

     int i=1;
     while (i<1){
         System.out.println("While loop");
         i++;
     }
// while loop bazı durumlarda hiç çalışmayabilir . while loop için
// "zero execution" mümkündür

        int k=1;
     do{
         System.out.println("do-while loop");
         k++;
     }while (k<1);

// do-while kullandığımızda loop body'si içindeki kod en az 1 kere çalışır
// "zero execution" do-while için mümkün değildir

//Ex1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz

        double num=24.5673;
        String str=String.valueOf(num);

// String.valueof() methodu parantezin içine konulan datanın tipini String yapar
// Regex için nokta kullandığınızda önüne "\\" koyun
        
        String virgulluKisim = str.split("\\.")[1]; //noktadan itibaren ayırdık. 1.indeksi aldık
        System.out.println(virgulluKisim); //5673

        int decimalInt = Integer.valueOf(virgulluKisim);  //int'a çevirdik
        System.out.println(decimalInt);
        int sum=0;
        do {
            sum = sum+decimalInt%10;
            decimalInt = decimalInt/10;

        }while (decimalInt>0);
        System.out.println(sum);

















    }
}
