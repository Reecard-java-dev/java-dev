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
public class delFile2
{
    
    public static void main(String o[])
    {
        
        File remove = new File("C:/Users/reeca/OneDrive/Desktop/noob.txt");
        
        boolean delete = remove.delete();
        if(delete)
        {
            System.out.print("file is deleted");
        }
        else
        {
              System.out.print("file is not deleted");
        }
        

    }
}
