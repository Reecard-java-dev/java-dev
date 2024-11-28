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
public class rand {
    
    public static void main(String []a)
    {
        Random ran = new Random();
        int x = ran.nextInt(6)+1;
        System.out.println(x);
    }
}
