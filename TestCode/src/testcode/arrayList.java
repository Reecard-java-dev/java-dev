
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcode;

/**
 *
 * @author reeca
 */
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String m[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        to add an element
        list.add(99);
        list.add(20);
        list.add(78);
        System.out.println(list);
        
//        to get element
            System.out.println(list.get(0));
            
//            to add element in between
            list.add(1,77);
             System.out.println(list);
//             set element
               list.set(0,77);
               System.out.println(list);
               
//               delete element
                list.remove(3);
                System.out.println(list);
                
//                size of array list
                
                System.out.println( list.size());
                
//                loops in array list

            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }
            
//            shorting in array list
            System.out.println();
                Collections.sort(list);
                 for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i));
            }
            
    }
}
