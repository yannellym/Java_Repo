# In this challenge, you have to calculate the first 'n' fibonacci numbers.

class HelloWorld {
    public static void main( String args[] ) {
        String fib = "";
        int n = 6;
        int first = 0, second = 1, fibonacci = 0;
        System.out.println("Fibonacci Series upto " + n + " Terms ");

        for (int c = 0; c < n; c++) {
            if (c <= 1) {
                fibonacci = c;
                fib += String.valueOf(fibonacci) + " ";
            } else {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
                fib += String.valueOf(fibonacci) + " ";
            }
            System.out.println(fibonacci + " ");
        }
    }
}
