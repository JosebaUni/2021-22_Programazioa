/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class A_04_01_SumAverageRunningInt1118899 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        double average;
        final int LOWERBOUND = 111;
        final int UPPERBOUND = 8899;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
        average = (double) sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.println("the average is " + average);
    }

}
