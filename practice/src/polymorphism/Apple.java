package polymorphism;

public class Apple extends Fruit{
    public void removeSeeds(){
        System.out.println("removed seeds");
    }
    public void makeAppleSauce(){
        System.out.println("making applesauce");
    }
    @Override
    public void makeJuice(){
        System.out.println("making apple juice");
    }
}

