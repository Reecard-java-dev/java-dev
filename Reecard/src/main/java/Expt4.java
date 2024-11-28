/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author reeca
 */
public class Expt4 {
    
    protected int Id;
    protected String Name;
    protected String Add;
    public Expt4 (int a)
    {
        System.out.println("constructor with parametric");
    }
    public Expt4()
    {
        System.out.println("non parametric");
    }
    
    
    
    public void setStudentId(int sid)
    {
        this.Id=sid;
       
    }
    
    public String getStudentName(String sname)
    {
        this.Name=sname;
        return this.Name;
       
     
    }
    public void getStudentAddress(String sadd)
    {
        
        this.Add=sadd;
    }
    public void Display()
    {
         System.out.println("name="+this.Id);
         System.out.println("name="+this.Name);
          System.out.println("Address="+this.Add);
    }
    
    public static void main(String jub[])
    {
            Expt4 q;      
            q = new Expt4(1);
            q.setStudentId(99);
            q.getStudentName("reecard");
            q.getStudentAddress("xelvona");
            q.Display();
            
             Expt4 q1;      
            q1 = new Expt4();
            q1.setStudentId(99);
            q1.getStudentName("reecard");
            q1.getStudentAddress("xelvona");
            q1.Display();
    }
}
    

