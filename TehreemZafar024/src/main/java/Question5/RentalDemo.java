/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import javax.swing.JOptionPane;

/**
 *
 * @author Brothers CMP
 */
public class RentalDemo {
    public static void main (String[]args){
         String m=JOptionPane.showInputDialog(null,"enter contract");
  
   String m1=JOptionPane.showInputDialog(null,"enter contract");
  
   String m2=JOptionPane.showInputDialog(null,"enter contract");
 
   String gh=JOptionPane.showInputDialog(null,"enter mint");
   int uh=Integer.parseInt(gh);
    String gj=JOptionPane.showInputDialog(null,"enter mint");
   int uk=Integer.parseInt(gj);
    String gi=JOptionPane.showInputDialog(null,"enter mint");
   int uz=Integer.parseInt(gi);
   
   
    Rental obj=new Rental (m,uh);
     Rental obj1=new Rental (m1,uk);
      Rental obj2=new Rental (m2,uz);
      
      
      obj. moxy();
      obj1. moxy();
      obj2. moxy();
  
     
    Rental lr=new Rental();
      Rental p=new Rental();
      lr.longer(obj,obj1);
      lr.longer(obj1, obj2);
      p=lr.longer(obj2,obj1);
      p.moxy();
     }
        
    }

   
