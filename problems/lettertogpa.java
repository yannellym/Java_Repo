package problems;// Coding Exercise#
// Write a method called letterToGPA that takes in a String value and returns the correct decimal GPA point, with respect to the scale given below:

// A+: 4
// A: 4
// A-: 3.7
// B+: 3.3
// B: 3
// B-: 2.8
// C+: 2.5
// C: 2
// C-: 1.8
// D: 1.5
// F: 0
// If any other grade is given, simply return a -1.
  
  class gpaHelper{
    public static double letterToGPA(String grade) {
        // A+: 4
        // A: 4
        // A-: 3.7
        // B+: 3.3
        // B: 3
        // B-: 2.8
        // C+: 2.5
        // C: 2
        // C-: 1.8
        // D: 1.5
        // F: 0
        double gpa;
        switch(grade) {
            case "A+":
                gpa = 4;
                break;
            case "A":
                gpa = 4;
                break;
            case "A-":
                gpa = 3.7;
                break;
            case "B+":
                gpa = 3.3;
                break;
            case "B":
                gpa = 3;
                break;
            case "B-":
                gpa = 2.8;
                break;
            case "C+":
                gpa = 2.5;
                break;
            case "C":
                gpa = 2;
                break;
            case "C-":
                gpa = 1.8;
                break;
            case "D":
                gpa = 1.5;
                break;
            case "F":
                gpa = 0;
                break;
            default:
                gpa = -1;
                break;
        }
        return gpa;
    }
}
