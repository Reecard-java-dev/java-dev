/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import print.*;
import java.io.*;
public class integerInput
{
    
    public static void main(String h[])
    {
        try
        {
        BufferedReader j = new BufferedReader(new InputStreamReader(System.in));
        print_fun l = new print_fun();
        System.out.print("enter a number:-");
        String in = j.readLine();
        int num = Integer.parseInt(in);
        l.print("the entered number is ="+num);
        
        }
        catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
        
        
    }
    
}
