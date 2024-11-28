/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import java.io.*;

public class test1
{
    public static void main(String k[])
    {
        try
        {
        BufferedReader h = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number:-");
        String f1 = h.readLine();
        int num1 = Integer.parseInt(f1);
        
        System.out.println("enter second number:-");
        String f2 = h.readLine();
        int num2 = Integer.parseInt(f2);
        
       
        int u = num1+num2;
         Thread.sleep(5000);
        System.out.print("the sum ="+u);
        }
//        catch(IOException e)
//        {
//            System.out.print(e.getMessage());
//        }
//        
//        catch(InterruptedException r)
//        {
//            System.out.print(r.getMessage());
//        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
       
       
        
    }
}
