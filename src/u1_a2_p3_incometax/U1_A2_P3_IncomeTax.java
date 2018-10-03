/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u1_a2_p3_incometax;

/**
 *
 * @author antho6229
 */
    
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class U1_A2_P3_IncomeTax {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        //declare contants
        final double FIRST_TAX_RATE = 0.15;
        final double SECOND_TAX_RATE = 0.205;
        final double THIRD_TAX_RATE = 0.26;
        final double FOURTH_TAX_RATE = 0.29;
        final double FIFTH_TAX_RATE = 0.33;
        
        //create Scanner and DecimalFormat
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###.##");
        
        //declare variables
        double salary, incomeTax;
        
        //get salary
        System.out.println("Enter your salary:");
    }
    
}
