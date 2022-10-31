package chapters1to8;

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double planFee = getPlanFee();
        double overageMinutes = getOverageMinutes();
        double overageFee = getOverageFee(overageMinutes);
        double tax = getTax(planFee, overageFee);
        double total = getTotal(planFee, overageFee, tax);
        printBill(planFee, overageFee, tax, total);
        scanner.close();
    }
    public static double getPlanFee(){
        System.out.println("Enter the base cost of the plan");
        double planFee = scanner.nextDouble();
        return planFee;
    }
    public static double getOverageMinutes(){
        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        return overageMinutes;
    }
    public static double getOverageFee(double overageMinutes){
        double overageFee = overageMinutes * 0.25;
        return overageFee;
    }
    public static double getTax(double planFee, double overageFee){
        double tax = (planFee + overageFee) * .15;
        return tax;
    }
    public static double getTotal(double planFee, double overageFee, double tax){
        double total = planFee + overageFee + tax;
        return total;
    }
    public static void printBill(double planFee, double overageFee, double tax, double total){
        System.out.println("Phone bill statement");
        System.out.println("Plan: $" + String.format("%.2f", planFee));
        System.out.println("Overage: $" + String.format("%.2f",overageFee));
        System.out.println("Tax: $" + String.format("%.2f",tax));
        System.out.println("Total: $" + String.format("%.2f",total));
    }

}
