package problems;// Problem statement#
// As we have already discussed that a two-dimensional array can also be thought of a matrix.

// Implement a Java method to initialize & print a two-dimensional array of size n x n in the form of a matrix. You should initialize and Print an array of size 3 x 3 as:

// The diagonal of the array should be filled with 0.
// The lower side should be filled will -1s.
// upper side should be filled with 1s.
// Note: In order to move a value to the next line you can use \n.

// Function prototype#
// void printMat(int n)
// Sample input#
// int n = 3;
class TwoDimArr {
    public static void main( String args[] ) {
       int n = 3; 
       int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) { //assign values to the arr
            for (int j = 0; j < arr.length; j++) {
                if (i == j) { //if row=column=> fill the matrix with 0
                    arr[i][j] = 0;
                } else if (i > j) { //if row>columns=> fill matrix with -1
                    arr[i][j] = -1;
                } else { //if row<columns=> fill matrix with 1
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { //print the array
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
