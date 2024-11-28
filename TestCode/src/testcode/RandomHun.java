/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import java.util.Random;
public class RandomHun
{
    public static void main(String l[])
    {
        int p=0;
        int[] arr= new int[100];
   
        for(int i=1;i<=100;i++)
        {
            arr[p]=i;
            p++;
        }
        Random ran = new Random();
        
        int arrIndx = ran.nextInt(arr.length);
        int ranNum = arr[arrIndx];
        
        System.out.print("random number="+ranNum);
    }
    
    
}
