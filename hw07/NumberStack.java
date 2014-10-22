// Greg Oprea
// CSE2
// HW07
// 10/21/14

// Take user input and make a stack of numbers by using loops (3 variations)

    // import scanner
    import java.util.Scanner;
// define a class
public class NumberStack {
    // add main method required for every program
    public static void main(String[]args) {
        // declare scanner
        Scanner entry;
        // call scanner constructor
        entry=new Scanner(System.in);
        // declare variables
        int z; // represent user entry
        int a; // used as counter
        int rows; // will tally # of rows to be displayed
        int column; // will tally # of columns to be displayed
        String dash; // will tally # of "-" to be displayed
        String display; // tally # of respective numbers to display
        
        System.out.println("Pick a number from 1 to 9"); // request user entry
        if(entry.hasNextInt()) { // verify entry was int
            z=entry.nextInt(); // assign z
            if(z<=9&&1<=z) { // verify entry is in range
                System.out.println("Using for loops:"); // start for loop runs
                for(a=1;z>=a;a++) {
                    dash="";
                    display="";
                    for(column=0;(a*2-1)>column;column++) {
                        dash+="-"; // add a "-" for every run thru
                        display+=a; // string together the numbers to be displayed in a row
                    }
                    for(rows=0;a>rows;rows++) {
                        System.out.println(display); // print the row of #s, respectively
                    }
                    System.out.println(dash); // print the dashes that separate the respective stacks of #s
                } // end of for loop
            
                System.out.println("    "); // start next stack
                System.out.println("Using while loops:"); // start while loop runs
                a=1; // reset counter
                while(z>=a) {
                    rows=0; // reset variables for this loop
                    column=0;
                    dash="";
                    display="";
                    while((a*2-1)>column) {
                        column++;
                        dash+="-"; // add a "-" for every run thru 
                        display+=a; // string together the numbers to be displayed in a row
                }
                    while(a>rows) {
                        System.out.println(display);
                        rows++;
                }
                System.out.println(dash);
                a++;
                } // end of while loop
                System.out.println("    "); // start next stack
                System.out.println("Using do-while loops:"); // start do-while loop runs
                a=1; // reset counter
                do {
                    rows=0; // reset variables for this loop
                    column=0;
                    dash="";
                    display="";
                    do {
                        column++;
                        dash+="-"; // add a "-" for every run thru
                        display+=a; // string together the numbers to be displayed in a row
                    } while((a*2-1)>column);
                    do {
                        System.out.println(display);
                        rows++;
                    } while(a>rows);
                    System.out.println(dash);
                    a++;
                } while(z>=a); // end of do-while loop
            } // end of nested if that checked range
            else {
                System.out.println("Your selection fell outside of the prescribed range");
            } // end else
        } // end of initial if that checked for int
        else {
            System.out.println("Your selection was not even an int!");
            
        } // end else
    }
}