package day28abstraction;

public class Civic implements Engine, Ac, Hood{
    //bir classi bir interface in child i yapmak icin "implements" kullaniriz


    @Override
    public void eco() {
        System.out.println("uses eco engine");
    }

    @Override
    public void gas() {
        System.out.println("uses gas");
    }

    @Override
    public void tsi() {
        System.out.println("uses tsi technology");
    }


    @Override
    public void digital() {
        System.out.println("uses digital ac");

    }

    @Override
    public void climate() {
        System.out.println("uses climate technology");

    }

    @Override
    public void steel() {
        System.out.println("Hood is made by steel");
    }
}
