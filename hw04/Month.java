// Greg Oprea
// CSE2
// HW04
// 9/23/14

    // import scanner
    import java.util.Scanner;
// define a class
public class Month {
    // add main method required for every program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner
        myScanner=new Scanner(System.in);
        
        // how many days in each month?
        int jan=31;
        int feb=28;
        int leap=29;
        int mar=31;
        int apr=30;
        int may=31;
        int jun=30;
        int jul=31;
        int aug=31;
        int sep=30;
        int oct=31;
        int nov=30;
        int dec=31;
        
        // request user input
        System.out.println("Enter an int giving the number of the month (1-12)-");
        int month ;
        // verify user input is an int
        if (myScanner.hasNextInt()) {
            month=myScanner.nextInt();
        } // end of if
        else {
            System.out.println("You did not enter an int");
            return;
        } // end of else
        // verify user input is between 1-12
        if (month>12||month<1) {
            System.out.println("You did not enter an int between 1 & 12");
        } // end of if
        
        //  display days in each month output
        if(month==1) {
            System.out.println("The month has "+jan+" days");
        } // end if
        if(month==2) {
            System.out.println("Enter an int giving the year");
            int febYear;
            if(myScanner.hasNextInt()) { // verify user input was an int
                febYear=myScanner.nextInt();
            } // end of if
            else {
                System.out.println("You did not enter an int");
                return;
            } // end of else
            if(febYear<0) { // verify input int was positive
                System.out.println("You did not enter a positive int");
            } // end of if
            if((febYear%4)==0) {
                System.out.println("The month has "+leap+" days");
            } // end of if
            else {
                System.out.println("The month has "+feb+" days");
            } // end of else
        } // end of first feb if
        if(month==3) {
            System.out.println("The month has "+mar+" days");
        } // end if
        if(month==4) {
            System.out.println("The month has "+apr+" days");
        } // end if
        if(month==5) {
            System.out.println("The month has "+may+" days");
        } // end if
        if(month==6) {
            System.out.println("The month has "+jun+" days");
        } // end if
        if(month==7) {
            System.out.println("The month has "+jul+" days");
        } // end if
        if(month==8) {
            System.out.println("The month has "+aug+" days");
        } // end if
        if(month==9) {
            System.out.println("The month has "+sep+" days");
        } // end if
        if(month==10) {
            System.out.println("The month has "+oct+" days");
        } // end if
        if(month==11) {
            System.out.println("The month has "+nov+" days");
        } // end if
        if(month==12) {
            System.out.println("The month has "+dec+" days");
        } // end if
    }
}