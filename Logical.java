// Find the Boolean NOT of x
// Boolean XOR the result of above with x itself
// Find the Boolean AND of the above answer with y
// Return the Boolean NOT of the entire expression
// Only write the code where instructed in the snippet below. You need to calculate the value of the expression, and then store your final result in the variable answer


class exercise {
    public static boolean exercise_two(boolean x, boolean y) {
        boolean answer = false;

        answer = !((!x ^ x) && y);
        return answer;
    }
}
