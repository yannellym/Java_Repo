/* Problem statement
Just like a Pokemon evolves, so do the expressions you work with. The mathematical expression given below is one such difficult expression, and hence, it is a challenge for you to solve!

Below is an illustration showing the expression you need to compute:

widget
Coding exercise#
Write a code in which you:

First, compute the respective powers of two floating-point variables x and y.
Then Add them after taking powers.
Then, compute the absolute value of floating-point z.
Subtract this from the above-computed addition value.
Now take Cube Root of the answer.
Use inbuilt functions to calculate this expression
Only write the code where instructed in the snippet below. You need to calculate the value of the expression, and then store your final result in the variable answer. The return statement and the variable to be returned are already mentioned for you. Don’t worry too much about the return statement for the moment, and just set the value of the answer correctly.
*/


class exercise {
    public static double exercise_one(double x, double y, double z) {
        double answer = 0;
        answer = Math.cbrt((Math.pow(x,2) + Math.pow(y, 2)) - Math.abs(z));
        // Calculate the value of an expression and store the final value in the answer
        
        /* You do not need to worry too much about the return statement for the 
        moment and just set the value of “answer” correctly*/
        return answer;   
    }
}
