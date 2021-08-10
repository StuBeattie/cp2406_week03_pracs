package CP2406_WK03;

public class ch3p1 {
    /*
    How many times (on average) do you have to roll a pair of dice before they come up snake eyes?
    You could do the experiment by rolling the dice by hand.
    Write a computer program that simulates the experiment.
    The program should report the number of rolls that it makes before the dice come up snake eyes.
    (Note: "Snake eyes" means that both dice show a value of 1.)
    Exercise 2.2 explained how to simulate rolling a pair of dice.
     */

    public static void main(String[] args) {
        int[] res = runOnce();
        System.out.println(res[0] +"," + res[1]);
    }

    public static int[] runOnce() {
        int die1;   // The number on the first die.
        int die2;   // The number on the second die.
        int roll;   // The total roll (sum of the two dice).

        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;

        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);

        int[] ret = {die1, die2};
        return ret;
    }  // end main()

}  // end class
