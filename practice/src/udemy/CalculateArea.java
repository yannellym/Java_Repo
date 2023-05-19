package udemy;

import java.util.Scanner;

public class CalculateArea {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("What is the base of the triangle? ");
        int base = s.nextInt();
        System.out.println("What is the height of the triangle? ");
        int height = s.nextInt();
        System.out.println("The area of the triangle is: " + (1.5) * (base*height));
        s.close();
    }
}
