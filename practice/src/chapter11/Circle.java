package chapter11;
// if you are inheriting an abstract method, you need to provide the implementation
// if you don't want to provide the implementation, you need to declare abstract on the function
public class Circle extends Shape {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Circle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    @Override
    double calculateArea() {
        return length * width;
    }
}
