/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class A_01_04_PrintNumberInWord {
      public static void main(String[] args) {
        int number = 23;
       
    
        if (number == 0) {
            System.out.println("ZERO" );
        } else if (number == 1) {
            System.out.println("ONE" );
        } else if (number == 2) {
            System.out.println("TWO" );
        } else if (3 == number) {
            System.out.println("THREE" );
        } else if (4 == number) {
            System.out.println("FOUR" );
        } else if (5 == number) {
            System.out.println("FIVE" );
        } else if (6 == number) {
            System.out.println("SIX" );
        } else if (7 == number) {
            System.out.println("SEVEN" );
        } else if (8 == number) {
            System.out.println("EIGTH" );
        } else if (9 == number) {
            System.out.println("NINE" );
        } else {
            System.out.println("OTHER" );
        }
    
       
        switch (number) {
            case 0:  System.out.println("ZERO" );  break;
            case 1:  System.out.println("ONE" );   break;
            case 2:  System.out.println("TWO" );   break;
            case 3:  System.out.println("THREE" ); break;
            case 4:  System.out.println("FOUR" );  break;
            case 5:  System.out.println("FIVE" );  break;
            case 6:  System.out.println("SIX" );   break;
            case 7:  System.out.println("SEVEN" ); break;
            case 8:  System.out.println("EIGTH" ); break;
            case 9: System.out.println("NINE" );  break;
            default: System.out.println("OTHER" ); break;
        
   
        }
    }
    
}
