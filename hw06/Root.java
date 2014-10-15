// Greg Oprea
// CSE2
// HW06
// 10/14/14

// use bisection method to arrive at approximate square root

    // import scanner
    import java.util.Scanner;
// define a class
public class Root {
    // add main method required for every program
    public static void main(String[]args) {
        // declare scanner
        Scanner entry;
        // call scanner constructor
        entry=new Scanner(System.in);
        double x=0; // user input, approximate square root of this #
        double low; // lower bound of estimate
        double mid=0; // midpoint of low and high
        double high; // upper bound of estimate
        
        // request user input
        while(!(x>0)) {
            System.out.println("Please enter a positive double");
            while (!entry.hasNextDouble()) {
                entry.nextLine();
                System.out.println("Please enter a positive double");
            }
            x=entry.nextDouble();
        }
        // take first crack at estimating root, establish range
        low=0;
        high=x+1;
        // get loopy and narrow down your root estimate
        while((high-low)>(.0000001*(x+1))) {
            // bisection
            mid=(((high-low)/2)+low);
            if(x>mid*mid) {
                low=mid; // midpoint squared was smaller than x so establish new lower bound
            }
            else {
                high=mid; // midpoint squared was larger than x so establish new upper bound
            } // end else
        } // end while
        // display results
        System.out.println("The sqaure root of "+x+" is approximately"+mid);
    }
}