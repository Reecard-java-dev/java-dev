/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import print.print_fun;
public class package_Test
{
    
   public static void main(String o[])
   {
       print_fun h = new print_fun();
       try
       {
           h.print("heyy");
          Thread.sleep(5000);
       
       h.print("are you reecard!");
       }
       catch(InterruptedException e)
       {
           System.out.print(e.getMessage());
       }
   }
    
}
