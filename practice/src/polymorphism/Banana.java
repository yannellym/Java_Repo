package polymorphism;

public class Banana extends Fruit{

    public void peel(){
        System.out.println("pealing banana");

    }
    public void makePudding(){
        System.out.println("making banana pudding");
    }

    @Override
    public void makeJuice(){
        System.out.println("making banana juice");
    }
}
