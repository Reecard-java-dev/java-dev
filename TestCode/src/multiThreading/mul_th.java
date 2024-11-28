/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiThreading;

/**
 *
 * @author reeca
 */
public class mul_th {
    public static void main(String[] args)
    {
        Mythread1 t1 = new Mythread1();
          Mythread2 t2 = new Mythread2();
          t1.start();
          t2.start();
        
        
    }
}

class Mythread1 extends Thread{
    
   @Override
   public void run(){
       int i=1;
       while(i<20){
       System.out.println("my ");
       i++;
       }
   }
}

class Mythread2 extends Thread{
    
   @Override
   public void run(){
       int j=1;
       while(j<30){
       System.out.println("my thread2 is running and i am happy");
       j++;
       }
   }
}
