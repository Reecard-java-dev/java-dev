/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

/**
 *
 * @author reeca
 */
import javax.swing.JOptionPane;

public class gui_test {
    
    public static void main(String[] a)
            
    {
        String name = JOptionPane.showInputDialog("enter your name:");
        
        JOptionPane.showMessageDialog(null, "hello "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age:"));
        
        JOptionPane.showMessageDialog(null, "age= "+age);
    }
    
}
