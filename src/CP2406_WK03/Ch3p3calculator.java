package CP2406_WK03;

import java.util.Scanner;

public class Ch3p3calculator {
    /* Write a program that will evaluate simple expressions such as 17 + 3 and 3.14159 * 4.7.
    The expressions are to be typed in by the user.
    The input always consists of a number, followed by an operator,
    followed by another number. The operators that are allowed are +, -, *, and /.
    You can read the numbers with TextIO.getDouble() and the operator with TextIO.getChar().
    Your program should read an expression, print its value,
    read another expression, print its value, and so on.
    The program should end when the user enters 0 as the first number on the line.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expression: ");
        double n1 = scanner.nextDouble();
        System.out.println("n1 = " + n1);

        String op = scanner.next();
        System.out.println("op = " + op);

        double n2 = scanner.nextDouble();
        System.out.println("n2 = " + n2);

        double res = 0;
        switch (op) {
            case "+" -> res = n1 + n2;
            case "-" -> res = n1 - n2;
            case "*" -> res = n1 * n2;
            case "/" -> res = n1 / n2;
            default -> System.out.println("are you on drugs????");
        }
        System.out.println("Result = " + res);
    }
}
