/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */

import java.io.File;
public class delete_file {
    
    public static void main(String c[])
    {
        File file = new File("C:\\Users\\reeca\\OneDrive\\Desktop\\javaR.txt");
        
        if(file.exists())
        {
            if(file.delete())
            {
                System.out.println("file deleted");
            }
        }
        else{
            System.out.print("file doesnt exist");
        }
    }
    
}
