/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;


public class timer {
    
    public static void main(String x[])
    {
        Timer time = new Timer();//a facility for threads to schdule tasks for future execution in the background
        
        TimerTask task = new TimerTask()  //task that can be schedule for one-time //abtract method called run
        {
            @Override
            public void run(){
                System.out.println("task is complete");
            }
            
        };
        
       // time.schedule(task, 5000);  for a specific time
       
        //for a sepecfic date,year,months ect
        
       Calendar date = Calendar.getInstance();
//        date.set(Calendar.YEAR,2025);
//        
//        date.set(Calendar.MONTH,Calendar.FEBRUARY);
//        
//        date.set(Calendar.MINUTE,0);
        date.set(Calendar.SECOND,0);
        
        time.schedule(task, date.getTime());
    }
    
}
