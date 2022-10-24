package problems;

// Implement a method in Java called sumOfDig which will return the sum of the digits in an int variable passed to it.
class SumDigits {
    public static int sumOfDig(int var) {
        int result = 0; //variable for resultant sum
        int lastDigit = 0;
        while (var > 0) {
            //seclude & keep adding the last digit into result
            lastDigit = var % 10;
            result = result + lastDigit; 
            System.out.println("Last Digit: " +  lastDigit);
            System.out.println("Sum: " +  result);           
            var /= 10; //update the new value of var
            System.out.println("Number: " + var);
        }
        return result;
    }
    public static void main( String args[] ) {
        int number = 1745;
        System.out.println("Number: " + number);
        System.out.println( "Sum of digits in 1024 is: "+ sumOfDig(number) );
    }
}
