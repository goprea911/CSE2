// Greg Oprea
// 9/12/14
// CSE2
// lab03

// compute cost of buying x number of Big Macs, must allow for input from user

    // to use scanner
    import java.util.Scanner;
// define a class
public class BigMac {
        // main method required for every Java program
        public static void main(String[] args) {
        
        // declare Scanner
        Scanner myScanner;
        // call Scanner constructor
        myScanner=new Scanner(System.in);
        // request input from user
        System.out.println("Enter the number of Big Macs (integer > 0): ");
        // # of Big Macs, from user input
        int nBigMacs=myScanner.nextInt();
        // request input from user
        System.out.println("Enter the cost per Big Mac as a double (in the form xx.xx): ");
        // cost input from user
        double bigMac$=myScanner.nextDouble();
        // request input from user
        System.out.println("Enter the percent tax as a whole number (xx): ");
        // tax input from user
        double taxRate=myScanner.nextDouble();
        // convert to proportion
        taxRate/=100;

        // 
        double cost$=nBigMacs*bigMac$*(1+taxRate);
        // 
        int dollars, dimes, pennies;
        // 
        dollars=(int)cost$;
        // 
        dimes=(int)(cost$*10)%10;
        // 
        pennies=(int)(cost$*100)%10;
        // 
        System.out.println("The total cost of "+nBigMacs+" BigMacs, at $"+bigMac$+" per bigMac,"+
        " with a sales tax of "+(int)(taxRate*100)+"%, is $"+dollars+'.'+dimes+pennies);
        
        }
}