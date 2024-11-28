/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reeca
 */
public class Try {
    public static void main(String w[])
    {
        try{
        int r = 50/0;
        }
        catch(ArithmeticException e)
        {
            System.out.print(e.getMessage());
        }
        
        
    }
    
}

