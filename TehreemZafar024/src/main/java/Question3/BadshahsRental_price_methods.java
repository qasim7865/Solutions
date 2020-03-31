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

public class BadshahsRental_price_methods {
    
    int mintutes;
    double hour;
    double price;
    
    public  static int time()
    {
         String sa=JOptionPane.showInputDialog(null,"total minutes");
         int as= Integer.parseInt(sa);
         double hours=as/60.0;
        JOptionPane.showMessageDialog(null,"total hours"+hours);
         
         return as;
    }
         public static void motto()
         { JOptionPane.showMessageDialog(null,"SsSsSsSsSsSsSsSsSs "+"\n"+" Badshahs make it fun in the sun"+"\nSsSsSsSsSsSsSsSsssss");
             
         }
          public int cost(int x)
          {
              if(x>60)
              {
                   int fab=x/60;
                 int y=x%60;
           double cost=40*fab+y;
            JOptionPane.showMessageDialog(null,"your total bill="+cost+"$");
              }
              else 
              {
                   JOptionPane.showMessageDialog(null,"your totalzz bill="+x);
              }
                     return 0;
          }
 public static void main(String[] args)
 {
     BadshahsRental_price_methods obj=new BadshahsRental_price_methods();
     
    int zZ= BadshahsRental_price_methods.time();
    
    BadshahsRental_price_methods.motto();
    obj.cost(zZ);
 }   }




