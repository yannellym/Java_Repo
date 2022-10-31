package chapters1to8;

// instantiating objects example
//
//
public class homeAreaCalculator {
    public static void main(String[] args) {
        // chapters1to8.Rectangle 1
        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();

        // chapters1to8.Rectangle 2
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);
    }
}
