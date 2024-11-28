/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

import java.io.IOException;

public class pc_shutdown2
{
    public static void main(String h[]) //shutdown pc 
    {
        try
        {
            Runtime shut = Runtime.getRuntime(); // object 
            shut.exec("shutdown /s /t 10");
        
        }
        catch(IOException x) //its an exception 
        {
            x.printStackTrace();
        }
    }
    
}