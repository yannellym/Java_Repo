package chapters1to8;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        System.out.println("Please enter a quantity for Pennies: ");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();
        double pennies_total = pennies * 0.01;
        System.out.println("Please enter a quantity for Nickels: ");
        int nickels = scanner.nextInt();
        double nickels_total = nickels * 0.05;
        System.out.println("Please enter a quantity for Dimes: ");
        int dimes = scanner.nextInt();
        double dimes_total = dimes * 0.10;
        System.out.println("Please enter a quantity for Quarters: ");
        int quarters = scanner.nextInt();
        double quarters_total = quarters * 0.25;
        scanner.close();

        double coin_sum = pennies_total + nickels_total + dimes_total + quarters_total;
        double under = (1.00 - coin_sum);
        double over = (coin_sum - 1.00);

        if(coin_sum == 1.00) {
            System.out.println("It's exactly $1, you win!");
        } else if (coin_sum < 1.00){
            System.out.println("Sorry, you missed " + under  + " to get to $1." );
        } else{
            System.out.println("Sorry, you have " + over + " more than $1." );
        }
        System.out.println("Thank you for playing the Dollar Game. Goodbye!");
    }
}
