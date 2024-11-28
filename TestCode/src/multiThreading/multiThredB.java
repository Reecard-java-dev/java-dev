/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiThreading;

/**
 *
 * @author reeca
 */
public abstract class multiThredB implements Runnable {
     @Override
    public void run()
    {
        try{
        for(int i=0;i<=5;i++)
        {
            System.out.println("reecard");
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException e)
        {
            
        }
    }
    
        
}

class B{
    public static void main(String x[])
    {
        try{
        multiThreadA s = new multiThreadA();
        s.start();
        for(int i=0;i<=5;i++)
        {
            System.out.println("juberl1..");
            Thread.sleep(1000);
        }
        }
        catch(InterruptedException s)
        {
        }
    }
}
