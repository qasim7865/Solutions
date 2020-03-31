/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Brothers CMP
 */
    import javax.swing.JOptionPane;

public class RentalDemo {
   
    String Deal;
    
    public static String deal()
    {
         String omi=JOptionPane.showInputDialog(null,"contract Number");
         return omi;
    }
    
 public static void main(String[] args)
      
 {
     
      RentalDemo obj=new RentalDemo();
       RentalDemo. deal();
 
       int bad= BadshahsRental_price_methods.time();
    
    BadshahsRental_price_methods.motto();
 }
 }




