package chapters1to8;// arrays example
//
//
//
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    // in uppercase to demonstrate constant
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i=0; i<LENGTH; i++){
            int randomNumber;

            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }
            while(search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        // if the number gets here, it means that the num is unique
        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return True if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        // this is called an enhanced loop.
        // iterates through array and assigns the current element to the value each time
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        // if we reach this point, then the entire array was searched and the value was not found
        return false;
    }
    public static void printTicket(int ticket[]){
        for (int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}

// binary search example
//    public static boolean binarySearch(int[] array, int numberToSearchFor){
//        // array must be sorted first
//        Arrays.sort(array);
//        int index = Arrays.binarySearch(array, numberToSearchFor);
//        if (index >=0){
//            return true;
//        } else return false;
//
//    }
