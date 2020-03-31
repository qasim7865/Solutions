/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

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
    private double price;
    public static int zoe;

    public Rental(String deal, int s) {
        this.deal = deal;
        setMintHours(zoe);
    }

    Rental() {
        
    }

    public  void setDeal(String deal) {
        this.deal = deal;
            JOptionPane.showMessageDialog(null,"contract Number"+this.deal);
        
    }

    public void setMintHours(int zoe) {
         if(zoe>60)
              {
                   int bala=zoe/60;
                   int lm=zoe%60;
                   
            price=bala*40+lm;
            JOptionPane.showMessageDialog(null,"your total bill="+price+"$");
             hours=bala;
             mintHours=lm;
             
              }
              else 
             
              {
                   JOptionPane.showMessageDialog(null,"your totalzz bill="+"40$");
                   hours=0;
                    mintHours=zoe;
                   
              }
    }
                     public void moxy(){
                            JOptionPane.showMessageDialog(null,"total hours="+hours);
                            JOptionPane.showMessageDialog(null,"total mints="+ mintHours);
                            JOptionPane.showMessageDialog(null,"contract Number="+deal);
                            JOptionPane.showMessageDialog(null," total price="+price);   
                     }
    public int  getMintHours() {
        return  mintHours;
    }

    public String getDeal() {
        return deal;
    }

    public int getHours() {
        return hours;
    }

    public double getPrice() {
        return price;
    }

  
    
     public Rental longer(Rental x,Rental libra){
        if(x.mintHours>libra.mintHours){
            return x;
        }
        else{
            return libra;
        }}}