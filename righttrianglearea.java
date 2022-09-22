// Write a class having two double type variables for length and height,
// an overloaded constructor and one member function called area which
// will return the area of the right-angled triangle.
  
  
  class rightAngleTriangle {
    public double length;
    public double height;
    
    public rightAngleTriangle(int b, int a) {
        length = b;
        height = a;

    }

    public double area(){
        return (length * height / 2.0);
    }
}

class challenge_one {
    public static double test(rightAngleTriangle rt) {
        return rt.area();
    }
}
