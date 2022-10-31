package polymorphism;

public class Market {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        ((Apple) apple).removeSeeds();

        Apple apple2 = new Apple();
        ((Apple) apple).removeSeeds();

        Fruit banana = new Banana();
        ((Banana) banana).peel();

        Banana banana2 = new Banana();
        banana2.peel();

        Fruit orange = new Fruit();

        represent(apple);
        represent(banana2);
        represent(orange);


    }

    public static void represent(Fruit fruit) {
        System.out.println("squeezing...");
        fruit.makeJuice();
    }
}
