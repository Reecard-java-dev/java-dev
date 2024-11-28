/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;
import java.util.*;
import java.io.*;

/**
 *
 * @author reeca
 */
public class stack_imp {
    
    public static void main(String []arg){
        try{
        int a,b;
     System.out.println("enter number");
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     a=Integer.parseInt(br.readLine());
     b=Integer.parseInt(br.readLine());
     System.out.println("sum is ="+(a+b));
        }
        catch(Exception e)
        {
            
        }
     
    }
    
}
