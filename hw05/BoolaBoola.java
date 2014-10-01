// Greg Oprea
// CSE2
// HW05
// 9/30/14

// Three boolean variables to each of which the value of true or false
// is randomly assigned. Randomly combine the three variables with random choices
// of && and || and store the result. Present the expression 
// to the user and ask the user to state the result of of the expression.

    // import scanner
    import java.util.Scanner;
// define a class
public class BoolaBoola {
    // add main method required for every program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner
        myScanner=new Scanner(System.in);
        // declare 3 boolean variables
        boolean a=Math.random()>0.5;
        boolean b=Math.random()>0.5;
        boolean c=Math.random()>0.5;
        // declare && and || operators
        String x;
        String y;
        // declare boolean to be false
        boolean value=false;
        // randomly generate first operator
        if(Math.random()>0.5) { // half chance between && and ||
            x="&&";
            // randomly generate second operator in true scenario
            if(Math.random()>0.5) { // half chance like above
                y="&&";
                if(a && b && c) {
                    value=true; // if if evaluates to true
                } // end nested if
            } // end if generating first operator
            else {
                y="||"; // second operator will be this provided second operator generator evaluates to false
                if(a && b || c){
                    value=true; // if if evaluates to true
                } // end if in nested if else
            } // end else in nested if
        } // end of intitial if
        else { // if initial if evaluates to false
            x="||"; // first operator is this provided initial if evaluates to false
            // randomly generate second operator in false scenario
            if(Math.random()>0.5) { // half chance like above
                y="&&"; // second operator will be this if if evaluates to true
                if(a || b && c) {
                    value=true; // if if evaluates to true
                } // end of nested if if in if else
            } // end of nested if in if else
            else {
                y="||"; // second operator will be this provided the second operator false scenario if evaluates to false
                if(a || b || c) {
                    value=true; // if if evaluates to true
                } // end if in if else in the false scenario
            } // end if else in false scenario
        } // end else of initial if
        
        // display the proposition
        System.out.println("Does "+a+" "+x+" "+b+" "+y+" "+c+" have the value true(t/T) or false(f/F)?");
        // accept user entry
        String entry=myScanner.next();
        // test entry
        if(((entry.equals("t") || entry.equals("T")) && value) || ((entry.equals("f") || entry.equals("F")) && !value)) {
            System.out.println("Correct"); // if entry evaluates to true
        } // end if
        else {
            System.out.println("Wrong; try again"); // if entry evaluates to false
        } // end else
    }
}