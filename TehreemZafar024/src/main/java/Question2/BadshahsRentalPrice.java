/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Brothers CMP
 */ 
    import javax.swing.JOptionPane;
import Question1.BadshahsMotto2;
public class BadshahsRentalPrice {
    int mint;
    double hours;
    double price;
    
     public void rentalCost()
     {
         String liam=JOptionPane.showInputDialog(null,"total minutes");
         int mint= Integer.parseInt(liam);
        double hours=mint/60.0;
        JOptionPane.showMessageDialog(null,"total hourse you spend is"+hours);
        if (mint>60)
        {
           
            int x=mint/60;
           int y=mint%60;
            price=40*x+y;
            JOptionPane.showMessageDialog(null,"your total bill="+price+"$");
            
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"your total bill="+mint);
        }
     }

    public static void main(String []args) {
      BadshahsMotto2 t = new  BadshahsMotto2();
		JOptionPane.showMessageDialog(null,t);
                BadshahsRentalPrice obj1=new BadshahsRentalPrice();
                        
                obj1.rentalCost();
    }
}




