import java.util.Scanner;
// object as a return type
public class HomeCalculatorAreaRedo {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HomeCalculatorAreaRedo calculator = new HomeCalculatorAreaRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println(area);
        calculator.scanner.close();
    }
    public Rectangle getRoom(){
        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
