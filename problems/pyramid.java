package problems;//  Write code that draws half a pyramid using the # character.

//  You are given an integer variable rows as input, and you have to print the pyramid with that number of rows displaying #.

class PrintPyramid {
    public static void test(int rows) {
        String hash = "# ";
        for(int i=1; i <=rows; i++){
            System.out.println(hash);
            hash += "# ";
        }
        //write the code for making and printing the pyramid here
        //use " " to add space between # in pyramid  
    }
}
