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
public class Rental{
        final static int minutes=590;
    final static double Rent=70;
    private String deal;
    private int time;
    private int mintHours;

    public  void setDeal(String deal) {
        this.deal = deal;
            JOptionPane.showMessageDialog(null,"contract Number"+this.deal);
        
    }

    public void setMintsourHours(int mintHours) {
        this.mintHours = mintHours;
        int abc= this.mintHours/60;
        int mints= this.mintHours%60;
        
        JOptionPane.showMessageDialog(null,"total hours"+abc+"\n"+" total minutes"+minutes);
        
         if(mintHours>60)
              {
                   int g9=mintHours/60;
                   int fol= mintHours%60;
           double price=40*g9+fol;
            JOptionPane.showMessageDialog(null,"your total bill="+price+"$");
              }
              else 
              {
                   JOptionPane.showMessageDialog(null,"your totalzz bill="+mintHours);
              }
          }

    public static int getMint() {
        return minutes;
    }

    public String getDeal() {
        return deal;
    }

    public int getHours() {
        return time;
    }

    public int getMintsourHours() {
        return mintHours;
    }
            public static void main(String[] args) {
Rental obj=new Rental ();

         obj.setDeal("k681");
         obj.setMintsourHours(minutes);
     }
}
  


