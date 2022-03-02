/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class A_04_01_SumAverageRunningIntSSumOfSquares {
    public static void main(String[] args) {
        int sum = 0;
        int product = 0; 
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number ){
            
           sum =sum + (number*number);
           ++number;
        }
        System.out.println("the sum of the squares is " + sum);
    }
    
}
