/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class A_04_01_SumAverageRunningIntSumOfOddnumbersandSumofEvennumbers {

    public static void main(String[] args) {
        int sumOdd = 1; // Accumulating sum of odd numbers
        int sumEven = 2;  // Accumulating sum of even numbers
        int absDiff;

        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        // Compute sums
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            if ((number % 2) != 0) {
                sumOdd += number + 2;
            } else {
                sumEven += number + 2;
            }
        }

        // Compute Absolute Difference
        if (sumOdd > sumEven) {
            absDiff = sumOdd + sumEven;
        } else {
            absDiff = sumEven - sumOdd;

            System.out.println("the sum of the odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
            System.out.println("the sum of the even numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumEven);
            System.out.println("the absolut difference is " + absDiff);
        }

    }
}