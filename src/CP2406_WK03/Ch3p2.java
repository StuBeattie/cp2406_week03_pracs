package CP2406_WK03;

public class Ch3p2 {

    /*
    Which integer between 1 and 10000 has the largest number of divisors,
    and how many divisors does it have?
    Write a program to find the answers and print out the results.
    It is possible that several integers in this range have the same,
    maximum number of divisors. Your program only has to print out one of them.
    An example in Subsection 3.4.2 discussed divisors.
    The source code for that example is CountDivisors.java.

    You might need some hints about how to find a maximum value.
    The basic idea is to go through all the integers,
    keeping track of the largest number of divisors that you've seen so far.
    Also, keep track of the integer that had that number of divisors.
     */
    public static void main(String[] args) {
        countDivisors(100);
    }

    public static void countDivisors(int N) {
        int testDivisor;  // A number between 1 and N that is a
        // possible divisor of N.
        int divisorCount;  // Number of divisors of N that have been found.
        int numberTested;  // Used to count how many possible divisors
        divisorCount = 0;
        numberTested = 0;

        for (testDivisor = 1; testDivisor <= N; testDivisor++) {
            if (N % testDivisor == 0)
                divisorCount++;
            numberTested++;
            if (numberTested == 10000000) {
                System.out.print('.');
                numberTested = 0;
            }
        }

        System.out.println();
        System.out.println("The number of divisors of " + N
                + " is " + divisorCount);


    }   // end main()
}
