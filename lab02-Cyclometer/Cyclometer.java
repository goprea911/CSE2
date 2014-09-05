//Gregory Oprea
//9-5-2014
//CSE2
//lab02-Cyclometer
//
//My bicycle cyclometer
//
public class Cyclometer {
    //main method required for every Java program
    public static void main (String[] args) {
    
    int secsTrip1=480; // records time (s) of trip 1
    int secsTrip2=3220; // records time (s) of trip 2
    int countsTrip1=1561; // records # of counts (rotations) of trip 1
    int countsTrip2=9037; // records # of counts (rotations) of trip 2
    
    double wheelDiameter=27.0, // records double the wheel diameter
    PI=3.14159, // defines the value PI
    feetPerMile=5280, // expresses miles in feet
    inchesPerFoot=12, // expresses feet in inches
    secondsPerMinute=60; // expresses minutes in seconds
    double distanceTrip1, distanceTrip2, totalDistance; // doubles the distance of each trip
    
    // print the values stored in variables above
    System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts."); // 
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts."); // 
    
    // compute distance values using values above
    distanceTrip1=countsTrip1*wheelDiameter*PI; // distance of trip 1 (in) (circumference of the wheel used to calculate d)
    distanceTrip1/=inchesPerFoot*feetPerMile;  // distance of trip 1 (mi)
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    totalDistance=distanceTrip1+distanceTrip2; // aggregates the two trips
    
    // print out the data
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
    } // end of main method
} // end of class