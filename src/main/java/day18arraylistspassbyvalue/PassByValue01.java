package day18arraylistspassbyvalue;

public class PassByValue01 {

/*
1) java variable'ların orjinal degerlerini korumak ister.
2) variable methodlar içinde kullanıldığında java methodun içinde
orjinal degeri koymaz, o degerin kopyasını üretir ve methoda
o kopyayı yollar. method kopya üstünde degisiklik yapar.Dolayısıyla
variable'ın orj. degeri korunmuş olur.Bu sisteme "PASS BY VALUE" denir.

 NOTE: java PASS BY VALUE kullanır
 NOTE: bazı prog. dilleri orjinal degeri koruma altına almamıştır. bu isi developerlara bırakmıştır.
 bu tarz diller PASS BY REFERENCE kullanır

 */


    public static void main(String[] args) {

        int x=5;
        System.out.println(x);  //5
        change(5);           //15
        System.out.println(x);  //5 -> xin orjinal değeri değişmedi

        int ucret=100;
        int kopya=indirim(ucret);
        System.out.println(kopya);
        System.out.println(ucret);
    }
//static method olan "main method' un icindeki her sey
// static olmalidir.
// "static" public'in önüne de arkasına da yazılabilir


    static public void change(int a){
        System.out.println(a*3);
    }
// void dışındaki "return" typelarda method bodysi içinde
// "return" keyword kullanılmalıdır
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }




}
