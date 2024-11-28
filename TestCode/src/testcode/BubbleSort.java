/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
//import java.io.*;
public class BubbleSort 
{
    public static void main(String x[])
    {
        int[] arr = {99,4,3,82,1};
        for(int i=0;i<arr.length-1;i++)  //loop to change arr 
        {
            for(int j=0;j<arr.length-i-1;j++) //to to change arr elements
            {
                if(arr[j]>arr[j+1])                 //O(n^2)
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
    }
      public static void print(int arr[])
      {
          for(int i=0;i<arr.length;i++)
          {
              System.out.println(arr[i]);
          }
      }
}