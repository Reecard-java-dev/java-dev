/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reeca
 */
import java.io.*;
public class INP {
    public static void main(String a[])
    {
        try{
        BufferdReader br = new BufferdReader(new InputStreamReader(System.in));
        System.out.print("enter num:-");
        String str1 = br.readline();
        int f = Integer.parseInt(str1);
        }
        catch(Exception e)
        {
        
            System.out.println(e.getMessage());
        }
    }
    
}
