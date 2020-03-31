/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Brothers CMP
 */
import javax.swing.JOptionPane;
import static java.lang.Character.isUpperCase;

public class Rental {
  String ooooop;
    public static String oop;
    public String narrow(){
       int k=0;
        while(k==0){
        String a;
        a=JOptionPane.showInputDialog(null,"contract Number");
        int u=a.length();
        
       char w=a.charAt(0);
       boolean umri=isUpperCase(w);
       if(u==4 && umri==true)
       {
           
           k=1;
           return a;
           
       }
        
        else
       {
           k=0;
        
           }     
        
    }
         return null;
    
    
}
public String holyWater()
{
     String hjk;
        hjk=JOptionPane.showInputDialog(null,"enter 10 digit Contact no");
        String op=hjk.replace("-","");
        String p=op.replace(" ", "");
           String oop=op.replace(".","");
           String ooop=oop.replace("_","");
            String oooop=ooop.replace("(","");
             ooooop=oooop.replace(")","");
             
     
        int rty=ooooop.length();
        if (rty<10 || rty>10){
            
           JOptionPane.showMessageDialog(null,"000000000000");
           
        }
        else{
            JOptionPane.showMessageDialog(null,ooooop);
       
        }
        return null;
  
}
        public void setooooop(String ooooop)
        {
            this.ooooop=ooooop;
           }

        public String getooooop()
        {
            return ooooop;
      
            
        }
        public void depression(){
            char[] gy=new char[ooooop.length()];
            for(int i=0;i<ooooop.length();i++){
            }}}    


