// Greg Oprea
// CSE2
// HW04
// 9/23/14

    // import scanner
    import java.util.Scanner;

// define a class
public class TimePadding {
    
    // main method required for every java program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner
        myScanner=new Scanner(System.in);
        // request user input
        System.out.println("Enter the time in seconds:");
        int input;
        // verify user input was an int
        if(myScanner.hasNextInt()) {
            input=myScanner.nextInt();
        } // end of if
        else {
            System.out.println("You did not enter an int");
            return;
        } // end of else
        // verify user input int was positive
        if(input<0) {
            System.out.println("You did not enter a positive int");
        } // end of if
        // divide to find hours
        int hours=(int)(input/60/60);
        int mins=(int)((input-(hours*60*60))/60);
        int secs=(int)((input-(hours*60*60)-(mins*60)));
        
        // display the padded time
        if(mins<10 && secs<10) {
            System.out.println("The time is   "+hours+":"+ 0 +mins+":"+ 0+secs);
        } // end if
        else if(mins>10 && secs<10) {
            System.out.println("The time is   "+hours+":"+mins+":"+ 0+secs);
        } // end else if
        else if(mins<10 && secs>10) {
            System.out.println("The time is   "+hours+":"+ 0+mins+":"+secs);
        } // end else if
        else {
            System.out.println("The time is   "+hours+":"+mins+":"+secs);
        } // end else
    }
}