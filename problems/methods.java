package problems;// Problem statement#
// Write a static method checkSum that adds two integer arguments and returns 0, 1 or 2.

// Takes two integers one and two in its input. Arguments are pass by value to the method.

// Has a check variable whose value gets updated as explained below.

// Adds num1 and num2, and checks if their sum is less than 100 in which case

// Sets the value of the check variable to 0.
// If sum is greater than 100

// Sets the value of the check variable to 1.
// If sum is equal to 100

// Sets the value of the check variable to 2.
// In the end, it will return the check variable.

class challenge_one {
    public static int checkSum(int one, int two) {
   

        int check;
        int sum = one + two;
        if (sum < 100) {
            check = 0;
        } else if (sum > 100) {
            check = 1;
        } else {
            check = 2;
        }


        return check;
    }
}
