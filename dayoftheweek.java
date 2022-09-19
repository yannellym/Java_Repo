// In this coding exercise, you are given a number x,
// and you have to set the corresponding day in the variable answer.
//   Which number corresponds to which day is given in the picture below! 
//   If the number given does not correspond to any of the numbers in 
//   the picture, simply set the answer to an "invalid input".
  
  class weekday {
    public static String week_day(int x) {
        String answer = ""; 

        switch(x){
            case 1:
                answer = "Monday";
                break;
            case 2:
                answer = "Tuesday";
                break;
            case 3:
                answer = "Wednesday";
                break;
            case 4:
                answer = "Thursday";
                break;
            case 5:
                answer = "Friday";
                break;
            case 6:
                answer = "Saturday";
                break;
            case 7:
                answer = "Sunday";
                break;
            default:
                answer = "invalid input";
                break;
        }
        return answer;
    }
}
