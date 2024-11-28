/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
public class Recursion 
{   
    public static void main(String xx[])
    {
        print_rec(1);
        
    }
    public static void print_rec(int a)         //stack
    {
       
        System.out.println(a);//    1   2   3
          if(a == 10)
        {
          
            return;
        }
        print_rec(a+1);
       
    }
    
}
