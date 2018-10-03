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
        
        final double FIRST_BRACKET = 46605;
        final double SECOND_BRACKET = 93208;
        final double THIRD_BRACKET = 144489;
        final double FOURTH_BRACKT = 205842;
        
        //create Scanner and DecimalFormat
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###.##");
        
        //declare variables
        double salary, incomeTax;
        
        incomeTax = 0;
        
        //get salary
        System.out.println("Enter your salary:");
        salary = keyedInput.nextInt();
        
        if(salary > 46605){
            incomeTax += 46605 * FIRST_TAX_RATE;
            if(salary > 93208){
                incomeTax += 93208 * SECOND_TAX_RATE;
                if(salary > 144489){
                    incomeTax += 144489 * THIRD_TAX_RATE;
                    if(salary > 205842){
                        
                    }
                }
            }else{
                incomeTax += (salary - 93208) * SECOND_TAX_RATE;
            }
        }else{
            incomeTax = salary * FIRST_TAX_RATE;
        }
    }
    
}
