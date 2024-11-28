/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
public class open_application 
{
    public static void main(String k[])
    {
        try
        {
            Runtime open_app = Runtime.getRuntime();
           // Thread.sleep(5000);
            open_app.exec("\"C:\\Users\\reeca\\Downloads\\VSCodeUserSetup-x64-1.92.2.exe\""); 
             
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
