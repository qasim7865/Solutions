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
public class RentalDemo {
    public static void main(String[] args){
        Rental obj=new Rental();
         Rental obj1=new  Rental();
          Rental obj2=new  Rental();
         Rental alop[]={obj,obj1,obj2};
        for(int i=0;i<alop.length;i++){
            int df=alop[i].input();
            int hyt=alop[i].input2();
            String ko=alop[i].holyWater();
            String hv=alop[i].narrow();
            alop[i]=new Rental(hv,df,ko,hyt);
            alop[i].disp();
            alop[i].getequipmntName();
            
            
        }
    }
}



