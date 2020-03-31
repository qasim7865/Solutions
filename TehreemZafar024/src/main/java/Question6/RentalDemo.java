/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

/**
 *
 * @author Brothers CMP
 */
   import javax.swing.JOptionPane;
public class RentalDemo {
    public static void main(String[] args){
        Rental hi=new Rental();
        int we=0;
        while(we==0){
            int end=hi.roxin();
            
            
            if (end>=60 && end<=7200){
                String line=hi.roxin2();
                RentalDemo gh=new RentalDemo();
                we=1;
            }
            else{
                we=0;
            }
         int cv=0; 
         while(cv==0){
            int again=hi.roxin();
            if (again>=60 && again<=7200){
                String neon=hi.roxin2();
                Rental nh=new Rental();
                cv=1;
            }
            else{
                cv=0;
            }
            int bj=0;
            while(bj==0){
            int notMe=hi.roxin();
            if (notMe>=60 && notMe<=7200){
                String qn=hi.roxin2();
                Rental ol=new Rental();
                int df=notMe/60;
                for(int i=0;i<df;i++){
                    JOptionPane.showMessageDialog(null, "Coupen good for 10 percent off next rental");
                }
                bj=1;
            }
            else{
                bj=0;
            }
        }
         }
        }
    }
}
  




