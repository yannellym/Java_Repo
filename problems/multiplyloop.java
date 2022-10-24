package problems;
// In this challenge, you have to print the multiplication table of a number up to 10.
  
  class MultiplicationTable {
    public static String test(int num) {
        String answer = "";
        for(int i = 1; i <=10; i++){
            answer += num * i + " ";
        };
        // Enter your code here
        // Store your final result in the variable answer
        
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of “answer” correctly*/

        return answer;
    }
}
