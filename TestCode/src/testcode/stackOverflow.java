/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
//public class stackOverflow 
//{
//   
//   public static void main(String x[])
//           
//    {
//        
//        int n=1;
//        print(n);
//        
//    }
//   public static  void print(int p)
//         
//   {
//       
//       System.out.println(p);
//       print(p+1);
//   }

//    
//        
//   
//}
















public class stackOverflow 
{
    public static void main(String c[])
    {
       int fact =1;
     int num=5
             ;
     sum_fact(num,fact);
     
    }
    public static void sum_fact(int num,int fact)
    {
        
       
     
     fact = fact * num;
 
  if(num == 1 )
     {
         System.out.println("factorial ="+fact);
         return;
     }

     
     sum_fact(num-1,fact);
       
       
    }
    
}
