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
public class pc_restart
{
    public static void main(String o[])
    {
        try{
        Runtime restart = Runtime.getRuntime();
        restart.exec("shutdown /r /t 3");
        }
        catch(IOException w)
        {
            w.printStackTrace();
        }
    }
    
}
