package day23inheritancepolymorphism;

public class Math extends Courses{

    public void practice(){
        System.out.println("solve questions");
    }
    public Math(){
        super("X");
        System.out.println("constructor 1");
    }
    public Math(int a){
        this(); // bu classin icindeki parametresiz constructor'i kullan
        System.out.println("constructor 2");

    }
}
