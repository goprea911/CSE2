// Greg Oprea
// CSE2
// HW04
// 9/23/14

    // import scanner
    import java.util.Scanner;

// define a class
public class CourseNumber {
    
    // main method required for every java program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner
        myScanner=new Scanner(System.in);
        // request user input
        System.out.println("Enter a six digit number giving the course semester-");
        int courseNo;
        // verify user input was an int
        if(myScanner.hasNextInt()) {
        courseNo=myScanner.nextInt();
        } // end if
        else {
            System.out.println("You did not enter an int");
            return;
        } // end else
        
        // isolate first four digits (year)
        int year=(int)(courseNo/100);
        // isolate the last two digits (semester)
        int semester=(int)(courseNo-(year*100));
        
        if(courseNo>=201440||courseNo<=186510) {
            System.out.println("The no. was outside the range [186510,201440]");
        } // end if
        else if(semester==10) {
            System.out.println("The course was offered in the Spring semester of "+year);
        } // end of else if
        else if(semester==20) {
            System.out.println("The course was offered in the Summer 1 semester of "+year);
        } // end of else if
        else if(semester==30) {
            System.out.println("The course was offered in the Summer 2 semester of "+year);
        } // end of else if
        else if(semester==40) {
            System.out.println("The course was offered in the Fall semester of "+year);
        } // end of else if
        else {
            System.out.println(courseNo+" is not a legitimate course number");
        } // end of else
    }
}