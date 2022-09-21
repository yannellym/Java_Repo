// Problem statement#
// In this exercise, you have to write a method test(), that first checks the length of the String given to the method as input.

// If the length of the String is an even number then return the entire String in upper case letters. On the other hand, if the length is odd, then return the entire String in lower case.

class challenge_four {
    public static String test(String x) {
        if (x.length() % 2 == 0) {
            return x.toUpperCase();
        }
        else{
            return x.toLowerCase();
        }
    }
}
