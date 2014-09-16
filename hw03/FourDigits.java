// Greg Oprea
// 9-16-14
// CSE2
// hw03

// output the first four decimal places of a number from the user

        // to use scanner
        import java.util.Scanner;
// define a class
public class FourDigits {
    // main method required for every java program
    public static void main(String[] args) {
    
    Scanner myScanner; // declare scanner
    myScanner=new Scanner(System.in); // call scanner constructor
    System.out.println("Please enter a double: "); // request input from user
    double rawNumber=myScanner.nextDouble(); // # from user
    
    int wholeNumber=(int)rawNumber; // isolate the numbers to the left of decimal
    double decimalNumber=rawNumber-wholeNumber; // subtract the raw number to leave us with only decimals
    int finalNumber=(int)(decimalNumber*10000); // multiply the decimalNumber by 10,000 to show the first four digits as an int
    
    System.out.println("The four digits are "+finalNumber); // display the results
    
    } // end of method
} // end of class