/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class A_04_01_SumAverageRunningIntdowhile {
    public static void main(String[] args) {
        int sum = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         sum += number;
         ++number;                     // update
      } while (number <= UPPERBOUND);  // test
        System.out.println("the sum is " + sum);
    }
}
