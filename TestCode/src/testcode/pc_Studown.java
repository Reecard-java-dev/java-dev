/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import java.io.IOException;
public class pc_Studown 
{   
    public static void main(String h[])
    {
        try
        {
            Runtime.getRuntime().exec("shutdown /s /t 1");
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    } 

   
}
