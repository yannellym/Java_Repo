package problems;// Given a number x, you should check whether it is even or odd.

// If it is even, then store "even" in answer.

// If it is odd, then store "odd" in answer.

// Only write the code where instructed in the snippet below. 
  
  
  class even_odd {
    public static String evenodd(int x) {
        String answer = "";

        answer = (x % 2 == 0) ? "even" : "odd";
        // Enter your code here
        // Store your final result in the variable answer
        
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of “answer” correctly*/
        
        return answer;
    }
}
