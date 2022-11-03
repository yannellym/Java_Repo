package chapter11;
// you cannot instantiate an abstract class. It is meant to be a template
// you can use the abstract class as a type
public class ShapeTester {
    public static void main (String[] args){
        Shape circle = new Circle(5, 7);
        circle.print();
        System.out.println(circle.calculateArea());
    }
}
