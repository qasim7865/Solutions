/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Brothers CMP
 */
 import javax.swing.JOptionPane;
    public final class Rental {
     final static int minutes=60;
    final static double Rent=40;
    private String deal;
    private int hours;
    private int mintHours;

    public Rental(String deal, int mintHours ) {
        setDeal(deal);
        setMintHours(mintHours);
    }

   public Rental() {
       this.deal ="A000";
       this.mintHours=0;
   
   }
    
    
    public void setDeal(String Deal) {
        this.deal = deal;
            JOptionPane.showMessageDialog(null,"contract Number"+this.deal);
    }

    public void setMintHours(int mintHours) {
        this.mintHours = mintHours;
         this.mintHours = mintHours;
        int abc= this.mintHours/60;
        int mints= this.mintHours%60;
        
        JOptionPane.showMessageDialog(null,"total hours"+abc+"\n"+" total minutes"+mints);
         if( mintHours>60)
              {
                   int sa= mintHours/60;
                 int as= mintHours%60;
           double price=40*sa+as;
           
            JOptionPane.showMessageDialog(null,"your total bill="+price+"$");
              }
              else 
              {
                   JOptionPane.showMessageDialog(null,"your total bill="+"40$");
              }               
    }    

    public String getDeal() {
        return deal;
    }

    public int getHours() {
        return hours;
    }

    public int getMintHours() {
        return mintHours;
    }
 public static void main(String[] args)
 {
       Rental obj1=new Rental("nextGen7723",1200);
     Rental obj2=new Rental();
 }
}          

