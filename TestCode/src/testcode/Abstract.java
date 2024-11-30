/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
public class Abstract {
    
    public static void main(String a[]){
        
       // car1 car11 = new car1(); //cannot create an object of and abtract class cause it provides secutity
                                    //but it can be extended and 
        
        car2 car22 = new car2();
        car22.car1info();
        
    }
    
}

abstract class car1{
    
    
    abstract void car1info();
    
    
}

 class car2 extends car1{
    
    @Override
    void car1info(){
        System.out.print("the car is working");
    }
    
}