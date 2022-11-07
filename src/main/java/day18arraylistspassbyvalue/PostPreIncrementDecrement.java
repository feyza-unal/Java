package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {
    public static void main(String[] args) {

///////////  post increment  ///////////

        int a=5;
        int b=a++;  // a yı atadı, sonra arttırdı

        System.out.println(b);  //5
        System.out.println(a);  //6

///////////  pre increment  ///////////

        int c=10;
        int d=++c;  // önce arttırdı, sonra atadı

        System.out.println(d);  //11
        System.out.println(c);  //11

///////////  post decrement  ///////////

        int e=20;
        int f=e--;

        System.out.println(f);  //20
        System.out.println(e);  //19

///////////  pre decrement  ///////////

        int h=30;
        int i=--h;

        System.out.println(h);  //29
        System.out.println(i);  //29
    }
}
