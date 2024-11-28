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
public class RandomNum
{
    public static void main(String l[])
    {
        int[] arr = {10,20,30,40,50};
        Random ran = new Random();
        
        int arrIndx = ran.nextInt(arr.length);
        
        int ranNum = arr[arrIndx];
        
        System.out.print("the random number is="+ranNum);
    }
}
