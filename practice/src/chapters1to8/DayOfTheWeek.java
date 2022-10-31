package chapters1to8;

import java.util.Scanner;

public class DayOfTheWeek {
    private static final int NUMOFDAYS = 7;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String daysArray[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int chosenNumDay = userResponse();
        String chosenDay = getDay(daysArray, chosenNumDay);
        System.out.println("Chosen day: " + chosenDay);

    }
    public static int userResponse(){
        System.out.println("Please input a number that corresponds to the day of the week");
        int response = scanner.nextInt();
        scanner.close();
        return response;

    }
    public static String getDay(String[] daysArray, int chosenNumDay){
        String chosenDay = daysArray[0];
        for(int i=0; i < NUMOFDAYS; i++){
            if (chosenNumDay == i+1) {
                chosenDay = daysArray[i];
            }
        }
        return chosenDay;
    }

}
