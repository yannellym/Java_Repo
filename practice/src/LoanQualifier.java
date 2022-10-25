import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]){
        // initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;
        // get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double years = scanner.nextDouble();

        scanner.close();
        // make decision

        if (salary >= requiredSalary){
            if (years >= requiredYearsEmployed){
                System.out.println("You qualify for a loan, Congrats!");
            } else{
                System.out.println("You must have worked at current job for" + requiredYearsEmployed + "years");
            }
        } else{
            System.out.println("Sorry, you must meet at least $" + requiredSalary + " to qualify for the loan.");
        }
    }

}
