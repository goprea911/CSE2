// Greg Oprea
// 9-16-14
// CSE2
// hw03

// output bicycle trip distance and average speed

        // to use scanner
        import java.util.Scanner;
// define a class
public class Bicycle {
    // main method required for every java program
    public static void main(String[] args) {
    
    Scanner myScanner; // declare scanner
    myScanner=new Scanner(System.in); // call scanner constructor
    System.out.println("Enter the length of trip (in secs): "); // request input from user
    int secsTrip=myScanner.nextInt(); // time of trip, from user
    System.out.println("Enter the number of counts from cyclomer :"); // request input from user
    int countsTrip=myScanner.nextInt(); // # of counts in trip, from user
    
    double wheelDiameter=27.0, // records double the wheel diameter
    PI=3.14159, // defines the value PI
    feetPerMile=5280, // expresses miles in feet
    inchesPerFoot=12, // expresses feet in inches
    secondsPerMinute=60; // expresses minutes in seconds
    double distanceTrip=countsTrip*wheelDiameter*PI; // distance of trip (PI*d)
    distanceTrip/=inchesPerFoot*feetPerMile; // distance of trip (mi)
    double tripMinutes=secsTrip/secondsPerMinute; // time of trip (min)
    double avgSpeed=(distanceTrip)*secondsPerMinute/tripMinutes; // average mph
    
    // format decimals
    int tripMinutesDis=(int)(tripMinutes*100);
    int avgSpeedDis=(int)(avgSpeed*100);
    int distanceTripDis=(int)(distanceTrip*100);
    
    // display the trip details
    System.out.println("You traveled "+distanceTripDis/100.0+" miles in "+tripMinutesDis/100.0+" minutes.");
    System.out.println("Your average speed was "+avgSpeedDis/100.0+" mph.");

    } // end of main method
} // end of class