/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagecalculator;
import java.util.Scanner;

/**
 *
 * @author Train
 */
public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int count = 0;
    double sum = 0;
    
    Scanner userInput = new Scanner(System.in);
    String message = userInput.nextLine();
    
    
    while (count < 6 ){
        System.out.println("Enter a number");
        if (scanner.hasNextDouble()){
            sum += scanner.nextDouble();
            count++;
        } else {
            scanner.next();
            break;
        }
    }
    
    if (count == 0){
        
    }
            
        

            System.out.println("There aren't enough values, please enter at least 6.");
           
           
          
       ;
    
        // TODO code application logic here
    }
    
}
