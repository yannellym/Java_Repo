package problems;// This challenge will test your understanding of String knowledge. The following steps must be done in that order and on the result from the previous step.

// 1- Remove all the leading and trailing spaces from the given string.

// 2- Take the result of step 1 and extract all characters between index 0 and 5 inclusive.

// 3- Take the result of step 2 and convert all letters to uppercase

// Only write the code where instructed in the snippet below. You need to store your final result in the variable answer

class stringchallenge {
    public static String sc(String text) {

        String answer = "";
        answer = text.trim();
        answer = answer.substring(0,6);
        answer = answer.toUpperCase();
        return answer; 
    }
}
