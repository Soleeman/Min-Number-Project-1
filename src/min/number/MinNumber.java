/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package min.number;
import java.util.Scanner; //Importing Scanner
/**
 *
 * @author sohak9660
 */
public class MinNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         System.out.println("Please Enter Three Numbers: " ); //Output Question
    double num1 = input.nextDouble(); // read first number
    double num2 = input.nextDouble(); // read second number
    double num3 = input.nextDouble();// read third number
    
    
    
    double result = minNum(num1, num2, num3);//Determines the Min Number
    
    
    
    System.out.println("The min Number is: " + result);//Outputs the Maximum Number
    }
     public static double minNum(double one, double two, double three){//The Parameters
        double MinimumNumber = one; //assume "one" is the largest to start 
        
        // determine whether two is smaller than minimumNumber
        if (two< MinimumNumber)
            MinimumNumber = two;
        
        // determine where three is smaller than minimumNumber
        if (three < MinimumNumber)
            MinimumNumber = three;
        
        return MinimumNumber;//Returns the Min Number
    }
}
