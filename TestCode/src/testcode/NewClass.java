/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import testcode.AcessMod2;

public class NewClass {
    
    public static void main(String []a){
        try{
            
        
        
        AcessMod2 e = new AcessMod2();
        System.out.println(e.age);
        System.out.println(e.name);
        
        
      //  System.out.println(e.address);
        
        }
        catch(Exception e){
            System.out.println("adress is private");
        }
        finally{
            System.out.print("example of exess modifiers");
        }
    }
    
}
