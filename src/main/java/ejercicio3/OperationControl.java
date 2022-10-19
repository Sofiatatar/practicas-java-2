
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class OperationControl {
    
    public Operation newOperation(){
        
        Scanner read = new Scanner(System.in);
        int number1;
        int number2;
        
        System.out.println("Ingrese el primer numero con el cual operara:");
        number1 = read.nextInt();
        System.out.println("Ingrese el segundo numero con el cual operara:");
        number2 = read.nextInt();
        
        return new Operation(number1, number2);
        
    }
    
    public int adittion(int num1, int num2){
        
        int adittion= num1 + num2;
        return adittion;
    }
    
    public int subtraction(int num1, int num2){
        
         int subtraction= num1 - num2;
        return subtraction;       
    }
    
    public int multiplication(int num1, int num2){
        
        int result;

        if(!validation(num1, num2)){
          result= 0;
        } else {
          result= num1 * num2; 
        }
        return result;
    }
    
    public int division(int num1, int num2) {
        
        int result; 
        
        if(!validation(num1, num2)){
          result= 0;
        }else{
            result= num1 / num2;
        }
        
        return result;
    }
    
    public boolean validation(int num1, int num2){
        
        boolean validation=true; 
        
        if (num1==0 || num2==0) {
            validation= false;
        }
        
        return validation;
    }
}
