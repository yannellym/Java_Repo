package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //createNewFile();
        //numbersExceptionHandling();
        arithmeticExceptionHandling();
    }
    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (Exception e){ // use Exception for when you don't know which error it will throw
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }
    public static void numbersExceptionHandling(){
        File file = new File("resources/number.txt");
        Scanner fileReader = null;
        try{
            fileReader = new Scanner(file);
            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            throw new RuntimeException(e);
        } finally {
            fileReader.close();
        }
    }
    public static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }
    public static void arithmeticExceptionHandling(){
        try{
            int c = 30/0;
        } catch ( ArithmeticException e) {
            System.out.println("Cannot divide number by 0");
            e.printStackTrace();
        } finally{
            System.out.println("Division is fun.");
        }
    }
}
