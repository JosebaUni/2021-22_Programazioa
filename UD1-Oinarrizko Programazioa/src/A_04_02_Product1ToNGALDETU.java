/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author admin
 */
public class A_04_02_Product1ToNGALDETU {
    public static void main(String[] args) {
         // Define variables
      int product = 1;      // The accumulated product, init to 1
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 13;
      for (int number= LOWERBOUND; number <= UPPERBOUND; ++number) {
         product = (number*product) ;
      }
       product=+ product;
       
        System.out.println("the product is " + product);
    }
    
}
