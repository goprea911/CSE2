// Greg Oprea
// CSE2
// HW04
// 9/23/14

// Calculate taxes on amount from user input

    // import scanner
    import java.util.Scanner;

// define a class
public class IncomeTax {
    
    // main method required for every java program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner
        myScanner=new Scanner(System.in);
        // declare tax brackets and respective rates
        double tax20k=.05;
        double tax40k=.07;
        double tax78k=.12;
        double taxOver78k=.14;
   
        // request user input
        System.out.println ("Enter an int giving the number of thousands:");
        int incomeInt;
        // verify input was an int
        if (myScanner.hasNextInt()) {
        incomeInt=myScanner.nextInt();
        } // end of if statement
        else {
        System.out.println("You did not enter an int");
        return; // return to program
        } // end of if
    
        // convert int to taxable income figure
        int income=incomeInt*1000;
        if(income<=0) {
            System.out.println("You did not enter a positive int");
            return;
        } // end of if
        
        // taxes on less than 20k
        else if(incomeInt<20) {
            // move decimals for clean display
            double taxPay20=income*tax20k;
            int taxPay20Prnt=(int)(taxPay20*100);
            int tax20kPrnt=(int)(tax20k*100*100);
            // display income, taxes & tax rate
            System.out.println ("The tax rate on $"+income/100.0+" is "+tax20kPrnt/100.0+"%, and the tax is $"+taxPay20Prnt/100.0);
        } // end of else if
    
        // taxes on 20k-40k
        else if((incomeInt>=20) && (incomeInt<40)) {
            // move decimals for clean display
            double taxPay40=income*tax40k;
            int taxPay40Prnt=(int)(taxPay40*100);
            int tax40kPrnt=(int)(tax40k*100*100);
            // display income, taxes & tax rate
            System.out.println ("The tax rate on $"+income+" is "+tax40kPrnt/100.0+"%, and the tax is $"+taxPay40Prnt/100.0);
        } // end of else if
    
        // taxes on 40k-78k
        else if((incomeInt>=40) && (incomeInt<78)) {
            // move decimals for clean display
            double taxPay78=income*tax78k;
            int taxPay78Prnt=(int)(taxPay78*100);
            int tax78kPrnt=(int)(tax78k*100*100);
            // display income, taxes & tax rate
            System.out.println ("The tax rate on $"+income+" is "+tax78kPrnt/100.0+"%, and the tax is $"+taxPay78Prnt/100.0);
        } // end of else if
    
        // taxes on 40k-78k
        else if(incomeInt>=78) {
            // move decimals for clean display
            double taxPayOver78=income*taxOver78k;
            int taxPayOver78Prnt=(int)(taxPayOver78*100);
            int taxOver78kPrnt=(int)(taxOver78k*100*100);
            // display income, taxes & tax rate
            System.out.println ("The tax rate on $"+income+" is "+taxOver78kPrnt/100.0+"%, and the tax is $"+taxPayOver78Prnt/100.0);
        } // end of else if

    }
}