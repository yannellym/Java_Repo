package polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog pascal = new Dog();
        pascal.fetch();
        pascal.makeSound();
        feed(pascal);

        Animal sasha = new Dog();
        sasha.makeSound();
        // we can do this because sasha is an Animal
        sasha = new Cat();
        sasha.makeSound();
        // casted to type cat. will only call it here to execute method
        ((Cat) sasha).scratch();
        feed(sasha);
    }
    public static void feed (Animal animal){
        if (animal instanceof Dog){
            System.out.println("Here's your dog food!");
        }
        else{
            System.out.println("here's your cat food");
        }
    }
}
