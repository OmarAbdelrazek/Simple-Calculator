@@ -0,0 +1,45 @@
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javax.swing.JTextPane;





/**

 @author Omar's PC
 */
public class CalculatorLogic  {

      double num,ans;
    int calculations;
    
    public static double operations(double num1 , double num2, int operation){
       
        switch(operation){
            case 1:
                return num1 + num2;
                
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                return num1 / num2;
                
          
        }
        return 0;
        
    }
    
    
    
    
}
