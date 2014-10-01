// Greg Oprea
// CSE2
// HW05
// 9/30/14

// program that takes a Burger King order for one of the following: burger, soda, or fries. Then ask for more specific details about the selected item

    // import scanner
    import java.util.Scanner;
// define a class
public class BurgerKing {
    // add main method required for every program
    public static void main(String[]args) {
        // declare scanner
        Scanner myScanner;
        // call scanner
        myScanner=new Scanner(System.in);
        // request input from user
        System.out.println("Enter a letter to indicate your choice of:\n  Burger (B or b)\n  Soda (S or s)\n  or Fries (F or f)");
        // evaluate user entry
        switch(myScanner.next()) {
            case "b":
            case "B":
                // burger details request
                System.out.println("Enter A or a for 'all the fixins'\n  C or c for cheese\n  N or n for none of the above");
                // evaluate & display burger details entry
                switch(myScanner.next()) {
                    case "a":
                    case "A": // 'all the fixins'
                        System.out.println("You ordered a buger with 'all the fixins'");
                        break;
                    case "c":
                    case "C": // cheese
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "n":
                    case "N": // none
                        System.out.println("You ordered a burger with none of the above");
                        break;
                    default: // unreadable burger details entry
                        System.out.println("You failed to make a selection");
                        break; // exits burger details
                        
                }
                break; // exits burger entry
            case "s":
            case "S": // soda
                // evaluate & display soda details entery
                System.out.println("Do you want Pepsi (p or P), Coke (c or C), Sprite (s or S) or Mountain Dew (m or M)");
                switch(myScanner.next()) {
                    case "p":
                    case "P": // pepsi
                        System.out.println("You ordered a Pepsi");
                        break;
                    case "c":
                    case "C": // coke
                        System.out.println("You ordered a Coke");
                        break;
                    case "s":
                    case "S": // sprite
                        System.out.println("You ordered a Sprite");
                        break;
                    case "m":
                    case "M": // mountain dew
                        System.out.println("You ordered a Mountain Dew");
                    default: // unreadable soda details entry
                        System.out.println("You failed to make a selection");
                        break; // exit soda details entry
                }
                break; // exit soda entry
            case "f":
            case "F":
                // evaluate & display fries details
                System.out.println("Do you want a large or small order of fries (l,L,s,or S)");
                switch(myScanner.next()) {
                    case "l":
                    case "L":
                        System.out.println("You ordered large fries");
                        break;
                    case "s":
                    case "S":
                        System.out.println("You ordered small fries");
                    default: // unreadable fries details entry
                        System.out.println("You failed to make a selection");
                        break; // exit fries details
                }
                break; // exit fries entry
            default: // unreadable initial order entry
                System.out.println("You failed to make a selection");
        }
    }
}