// methods example
import java.util.Scanner;

public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
    }
    public static void getFormData(){
        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        scanner.close();
    }
    public static double getSalary(){
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }
    public static void notifyUser( boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! you have been approved.");
        } else{
            System.out.println("Sorry, you have been declined");
        }

    }
}
