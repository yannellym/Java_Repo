package chapters1to8;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Please enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;
        switch(grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great job";
                break;
            case "C":
                message = "Could be better";
                break;
            case "D":
                message = "Needs improvement";
                break;
            case "F":
                message = "Try harder next time";
                break;
            default:
                message = "Error. Invalid grade";
        }
        System.out.println(message);
    }
}
