   /****************************************************************************
 *
 * Created on : 21 Dec. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit5-02
 * This program finds the greatest value in an array
 *
 ****************************************************************************/
import java.util.Scanner;

public class greatestValueArray 
{       
     public static int greatestValueInArray (String[] AnArray) 
     {    
          int greatestValueOfArray = 0;
    
          for (int counter = 0; counter < AnArray.length; counter++) 
          {
               if (greatestValueOfArray < Integer.valueOf(AnArray[counter])) 
               {
                    greatestValueOfArray = Integer.valueOf(AnArray[counter]);
                }
           }    
          return greatestValueOfArray;
     }
         
    public static void main(String[] args) 
    {
         // input
         Scanner problem = new Scanner(System.in);
         System.out.println("Create an array by entering numbers and putting a space between them.");
         String[] TheNumbers = (problem.nextLine()).split(" ");
         //System.out.println(TheNumbersString);
    
         // process
         int greatestValue = greatestValueInArray(TheNumbers);
    
         // output
         System.out.println("The greatest value is: " + greatestValue);
     }
}      
        
       
