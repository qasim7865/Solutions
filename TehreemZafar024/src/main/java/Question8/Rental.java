/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Brothers CMP
 */
    import static java.lang.Character.isUpperCase;
import javax.swing.JOptionPane;
public class Rental {

    final static int mint=60;
    final static double perhourRent=40;

   
    private String contractNo;
    private int hours;
    private int mintsourHours;
    private double price;
    public static int s;
    int equipmntType;
    static int uk;
    static String ooooop;
    final String Array[]={"Personal watercraft","pontoon boat","Rowboat","canoe","kayak","beach chair","umbrella","other"};

    
    public int input(){
        String a;
        a=JOptionPane.showInputDialog(null,"Enter mint for rental" );
        int b=Integer.parseInt(a);
        return b;
        
        
    }
      public int input2(){
        String ry;
        ry=JOptionPane.showInputDialog(null,"Enter equipment type" );
        int uk=Integer.parseInt(ry);
        return uk;
        
        
        
    }
      public  void setContractNo(String contractNo) {
        this.contractNo = contractNo;
            
        
    }
      public void setequipmntType(int uk){
      if (uk>Array.length)
      {
          equipmntType=(Array.length)-1;
      }
      else 
      {
           equipmntType=uk;
      }
      }
      

      public int getequipmntType(){
          return equipmntType;

      }
           public void getequipmntName(){
         JOptionPane.showMessageDialog(null,"your equipmnt name is"+Array[equipmntType] );
          }
           
           public void setMintsourHours(int s) {
         if(s>60)
              {
                   int zk=s/60;
                   int lm=s%60;
                   
            price=zk*40+lm;
            JOptionPane.showMessageDialog(null,"your total bill="+price+"$");
             hours=zk;
             mintsourHours=lm;
             
              }
              else 
             
              {
                   JOptionPane.showMessageDialog(null,"your totalzz bill="+"40$");
                   hours=0;
                    mintsourHours=s;
                   
                   
              }
    }
  
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
    public Rental(String contractNo, int s,String contactNo,int uk) {
        this.contractNo = contractNo;
        setMintsourHours(s);
        this.contractNo=contractNo;
        setequipmntType(uk);
    }
    public Rental() {
        
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
        public void disp(){
            char[] gy=new char[ooooop.length()];
            for(int i=0;i<ooooop.length();i++){
                gy[i]=ooooop.charAt(i);
            }
            String nq="("+gy[0]+gy[1]+gy[2]+") "+gy[3]+gy[4]+gy[5]+"-"+gy[6]+gy[7]+gy[8]+gy[9];
            JOptionPane.showMessageDialog(null, nq);
        }
              
        public int  getmintsourHours() {
        return  mintsourHours;
    }

    public String getContractNo() {
        return contractNo;
    }

    public int getHours() {
        return hours;
    }

    public double getPrice() {
        return price;
    }
      }




