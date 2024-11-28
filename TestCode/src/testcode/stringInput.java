/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import java.util.Scanner;
public class stringInput 
{
    
        public static void main(String k[])
        {
            try
            {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your name:-");
            String name = scan.nextLine();
             System.out.println("your name will be displayed in 5 seconds");
            Thread.sleep(5000);
            System.out.print("your name is "+name);
           
            }
            catch(InterruptedException e)
            {
               System.out.print(e.getMessage());
            }
            
        }
    
}
