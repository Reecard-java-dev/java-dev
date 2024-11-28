/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reeca
 */
public class INHERIT {
    
    public static void main(String t[]){
        Yo y = new Yo();
        y.hi();
        y.ji();
    }
}

 class Yo extends tt{
    
    public void hi()
    {
         System.out.println("hi");
    }
    
}
class tt{
    public void ji()
    {
        System.out.println("hiiiiieee");
    }
    
}

