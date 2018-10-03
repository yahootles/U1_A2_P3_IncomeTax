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
        final double FOURTH_BRACKET = 205842;
        
        //create Scanner and DecimalFormat
        Scanner keyedInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$###.##");
        
        //declare variables
        double salary, incomeTax;
        
        incomeTax = 0;
        
        //get salary
        System.out.println("Enter your salary:");
        salary = keyedInput.nextInt();
        
        //calculate income teax
        if(salary > FIRST_BRACKET){
            
            incomeTax += FIRST_BRACKET * FIRST_TAX_RATE;
            
            if(salary > SECOND_BRACKET){
                
                incomeTax += (SECOND_BRACKET - FIRST_BRACKET) * SECOND_TAX_RATE;
                
                if(salary > THIRD_BRACKET){
                    
                    incomeTax += (THIRD_BRACKET - SECOND_BRACKET) * THIRD_TAX_RATE;
                    
                    if(salary > FOURTH_BRACKET){
                        
                        incomeTax += (FOURTH_BRACKET - THIRD_BRACKET) * FOURTH_TAX_RATE;
                        
                        incomeTax += (salary - FOURTH_BRACKET) * FIFTH_TAX_RATE;
                        
                    }else{
                        
                        incomeTax += (salary - THIRD_BRACKET) * FOURTH_TAX_RATE;
                        
                    }
                    
                }else{
                    
                    incomeTax += (salary - SECOND_BRACKET) * THIRD_TAX_RATE;
                    
                }
                
            }else{
                
                incomeTax += (salary - FIRST_BRACKET) * SECOND_TAX_RATE;
                
            }
            
        }else{
            
            incomeTax = salary * FIRST_TAX_RATE;
            
        }
        
        System.out.println("Your income tax is: " + df.format(incomeTax));
    }
    
}
