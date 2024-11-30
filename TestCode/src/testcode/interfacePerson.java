/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
public class interfacePerson implements person,Person2{
    
    @Override
    public void actions(){
        System.out.println("is walking person");
    }
    
    
    @Override
    public void actions2(){
        System.out.println("is walking person2");
    }
    
    

    
}
