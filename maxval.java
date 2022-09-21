// Problem statement#
// Write a method named findMaxVal() to find the maximum integer value stored in an Array of any size.

// Input#
// The input to the method will be an array passed as a parameter.
// Output#
// As an output the method will return the maximum value found in the array.
// Sample input & output#
// Input: {4, 10, 12, 17, 11}
// Output: 17
  
class CheckMax {

    public static int findMaxVal(int[] arr) {

        int highestNum = arr[0];
        for(int i = 1; i < arr.length; i ++){
            if (arr[i] > highestNum) {
                highestNum = arr[i];
            }
        }
        return highestNum;
    }
}
