// You have to write a function that uses the Generic 
// Class type to write a single function that works 
// for both int and double inputs. Remove the two 
// functions below in the code widget and instead 
// write a Generic class type array_max function
//  that finds max value for either of the two types.
  
  class FindMax {
    public static < T extends Comparable < T >> T array_max(T data[], int n) {
        T max = data[0];
        int i;
        for (i = 1; i < n; i++) {
            if (max.compareTo(data[i]) < 0) {
                max = data[i];
            }
        }
        return max;
    }
}
