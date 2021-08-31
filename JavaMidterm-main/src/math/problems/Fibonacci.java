package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci series of " + maxNumber + "numbers:");

        for (int i = 1; i <= maxNumber; ++i) {
            System.out.println(previousNumber+ " ");
            /* on each iteration, we are assigning the second number to the first number and assigning the sum
            of last two numbers to the second number */
        int sum = previousNumber + nextNumber;
        previousNumber = nextNumber;
        nextNumber = sum;
        }
    }
}
