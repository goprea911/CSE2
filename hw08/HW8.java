// Greg Oprea
// CSE2
// HW08
// 10/28/14

// test out the functionality of methods with overloaded versions of getInput() 
// before using the methods in a full-blown program

    // import scanner
    import java.util.Scanner;
// define a class
public class HW8 {
    // add main method required for every program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner constructor
        myScanner=new Scanner(System.in);
        char entry; // declare variable to be used for user entry
        int x; // declare counter
        System.out.println("Enter 'C' or 'c' to continue, anything else to quit-"); // prompt user
        entry=getInput(myScanner,"cC"); // execute in another main method
        System.out.println("You entered '"+entry+"'"); // display entry
        System.out.println("Enter 'y', 'Y', 'n', or 'N'-"); // prompt user
        entry=getInput(myScanner,"nyNY",5); // execute in another main method and allow max of 5 entries
        if(entry!=' ') {
            System.out.println("You entered '"+entry+"'"); // display entry
        } // end if
        entry=getInput(myScanner,"Choose a digit.","0123456789"); // execute in another main method
        System.out.println("You entered '"+entry+"'"); // display entry
    } // end main method
    // start cC method
    public static char getInput(String string, Scanner entry) {
        while (true) {
            String entryx=entry.next(); // declare string
            if(entryx.length()==1) {
                char Entry=entryx.charAt(0); // cast to char
                if(Entry=='c'||Entry=='C') { // verify Cc selections
                    return Entry;
                } // end nested if
                else {
                    System.out.println("You did not enter a character from the list 'Cc'; try again-"); // prompt user
                    continue; // return to while loop
                } // end else
            } // end if nested in while loop
            else {
                    System.out.println("You did not enter a character from the list 'Cc'; try again-"); // prompt user
                    continue; // return to while loop
            } // end else
        } // end while loop
    } // end of cC method
    // start nyNY method
    public static char getInput(String string, Scanner entry, int x) {
        x=0; // reset counter
        char Entry=' ';
        while(5>x) { // allows a max of 5 entries
            String entryx=entry.next(); // cast to string
            if(entryx.length()==1) { // verify user entry was 1 character
                Entry=entry.charAt(0); // cast to char
                if(x==4) { // 4 re-entries (5 total attempts)
                    System.out.println("You failed after 5 tries");
                    return Entry=' '; // return Entry
                } // end if that checks retry counter
                if(Entry=='n'||Entry=='y'||Entry=='N'||Entry=='Y') { // verify nyNY selection
                    return Entry; // return char
                }
                else {
                    System.out.println("Enter 'y', 'Y', 'n', 'N'-"); // prompt user
                    ++x; // tally the iteraitons
                    continue; // run the while loop again
                } // end else in nested if
            } // end if in while
            else {
                System.out.println("Enter 'y', 'Y', 'n', 'N'-"); // prompt user
                ++x; // tally the iterations
                continue; // go back to while loop
            } // end else
        } // end while
        return Entry;
    } // end nyNY method
    // start 123 method
    public static char getInput(String string, String x, Scanner entry) {
        System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-"); // prompt user
        while (true) {
            String entryx=entry.next(); // cast to string
            if(entryx.length()==1) { // verify character length is just 1
                char Entry=entry.charAt(0); // cast to char
                if(Entry=='0'||Entry=='1'||Entry=='2'||Entry=='3'||Entry=='4'||Entry=='5'||Entry=='6'||Entry=='7'||Entry=='8'||Entry=='9'); // prompt user
                    return Entry; // return Entry
            } // end of if in while
            else {
                System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-"); // prompt user
                continue; // run the while loop again
            } // end else
        } // end while
    } // end 123 method
}