// Greg Oprea
// CSE2
// 9/19/14
// lab04

// Help user place an order for Big Macs and fries and discover cost

 // to use scanner
    import java.util.Scanner;
// define a class
public class BigMacAgain {
    // main method required for every Java program
    public static void main(String[] args) {
        
        // declare Scanner
        Scanner myScanner;
        // call Scanner constructor
        myScanner=new Scanner(System.in);
        // declare prices of items
        double bigMac$=2.22;
        double fries$=2.15;
        // request input from user regarding Big Macs
        System.out.println("Enter the number of Big Macs (integer > 0):");
        int nBigMacs;
        // check input for int
        if (myScanner.hasNextInt ()) {
                nBigMacs=myScanner.nextInt(); // if if statement is true
        } // end of if
        else{
                System.out.println("You did not enter an integer > 0"); // if if is false
                return; // leave the program
        } // end of else statement
        
        if (nBigMacs>0) {        
                double bigMacTotal=nBigMacs*bigMac$;
                int bigMacTotalDis=(int)(bigMacTotal*100);
                System.out.println ("You ordered "+nBigMacs+" Big Macs totaling $"+bigMacTotalDis/100.0);
        } // end of if
        else {
                System.out.println ("You must enter an integer > 0");
                return;
        } // end of else
        
        double bigMacTotal=nBigMacs*bigMac$; // price of purchase
        int bigMacTotalDis=(int)(bigMacTotal*100); // for decimal display
        
        // request input from user regarding Fries
        System.out.println("Would you like an order of fries? (Y/y?N/n)");
        String inputFries=myScanner.next();
        
        if ((inputFries.equals("N"))||(inputFries.equals("n"))) {
                System.out.println ("Your order total is $"+bigMacTotalDis/100.0);
        } // end of if
        else if ((inputFries.equals("Y"))||(inputFries.equals("y"))) {
                System.out.println ("You ordered fries totaling $"+fries$);
                System.out.println ("Your order total is $"+(bigMacTotalDis/100.0+fries$));
        } // end of else & nested if statement
        else {
                System.out.println ("You must enter one of the following: 'Y','y','N','n'");
                return;
        } // end of else
    }
}