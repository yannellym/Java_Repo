package udemy;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length, breadth, height;
        int totalArea, volume;
        System.out.println("Enter the length breadth and height");
        length = s.nextInt();
        breadth = s.nextInt();
        height = s.nextInt();

        totalArea = 2 *(length*breadth+length*height+breadth*height);
        volume = length * breadth * height;
        System.out.println("Total area:" + totalArea);
        System.out.println("Volume: " + volume);

    }
}
