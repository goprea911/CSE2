// Greg Oprea
// 9-16-14
// CSE2
// hw03

// estimate the cube root of a number (provided by the user) with increasing accuracy

        // to use scanner
        import java.util.Scanner;
// define a class
public class Root {
    // main method required for every java program
    public static void main(String[] args) {
    
    Scanner myScanner; // declare scanner
    myScanner=new Scanner(System.in); // call scanner constructor
    System.out.println("Estimate the cube root of a number! Please enter a double: "); // request input from user
    double g=myScanner.nextDouble(); // # from user
    
    double g1=g/3; // first guess
    double g2=(2*g1*g1*g1+g)/(3*g1*g1); // 1st improvement
    double g3=(2*g2*g2*g2+g)/(3*g2*g2); // 2nd improvement
    double g4=(2*g3*g3*g3+g)/(3*g3*g3); // 3rd improvement
    double g5=(2*g4*g4*g4+g)/(3*g4*g4); // 4th improvement
    double g6=(2*g5*g5*g5+g)/(3*g5*g5); // 5th improvement
    
    System.out.println("The cube root estimate is "+g6); // display estimate
    
    } // end of method
} // end of class