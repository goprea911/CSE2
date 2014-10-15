// Greg Oprea
// CSE2
// HW06
// 10/14/14

// run Monte Carlo simulation and tally # of roulette losing trials and winning trials and profit

// define a class
public class Roulette {
    // add main method required for every program
    public static void main(String[]args) {
        // declare variables
        int spins=1; // counter for # of spins in a trial
        int spinsEnd=100; // last spin is the 100th
        int trials=1; // counter for # of trial runs (100 spins in each)
        int trialsEnd=1000; // last trial is the 1000th
        int bet; // # that is bet on
        int hit; // # that hits
        int wins=0; // counter for # of bets that hit
        int profit=0; // aggregate $ won
        int winningTrials=0; // counter for # of winning trial runs
        int sandsWin=0; // counter for # of losing trial runs
        
        // start trial run
        while (trialsEnd>trials) { // run from trial 1 - 1000
            spins=1; // reset # spins after each trial
            wins=0; // reset # of wins after each trial
            while (spinsEnd>spins) { // run from spin 1 - 100
                bet=(int)(Math.random()*38)+1; // generate roulette number randomly (place bet)
                hit=(int)(Math.random()*38)+1; // generate roulette number randomly (dealer rolls)
            
                if(bet==hit) { // you won!
                    wins++; // tally wins
                }
                spins++; // tally roulette spins up to 100 per trial
            }
            if(wins==0) {
                sandsWin++; // tally # of trials in which you never hit
            }
            profit+=(wins*36); // aggregate total profit
            if(wins>=3) { // must hit 3 times to finish in black
                winningTrials++; // tally # of profitable trials
            }
            trials++; // tally # of trials to 1000
        }
        // display monte carlo results
        System.out.println("Your gambling income is $"+profit);
        System.out.println("You had "+winningTrials+" profitable runs");
        System.out.println("The Sands took everything you had "+sandsWin+" times");
    }
}
