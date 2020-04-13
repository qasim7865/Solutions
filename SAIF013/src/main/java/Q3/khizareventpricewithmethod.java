/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class khizareventpricewithmethod {
    public static int displayGuest(){
     System.out.println(" enter no of guest=");
    Scanner input= new Scanner(System.in);
    int guest=input.nextInt();
    return guest;
    
            
}
   public static void displayMotto()     {
       String s = "Khizar’s makes the food that makes it a party";
   System.out.println("==================================================");
     System.out.println("= "+s+"  =");
                                                  
   System.out.println("==================================================");
   }   
    public static void displayMethod(int g){
          int totalPrice;
    int perPrice=35;
        System.out.println("no of guest = "+g);
        System.out.println("price per guest"+perPrice+"$");
        totalPrice=g*perPrice;
        System.out.println("totalPrice"+totalPrice);
        if(g>50){
            System.out.println("event is large");
        }
        else{
            System.out.println("event is small");
        }
       
        
    }
    public static void main(String[] args) {
    
        int x=khizareventpricewithmethod.displayGuest();
        khizareventpricewithmethod.displayMethod(x);
        khizareventpricewithmethod.displayMotto();
     
   }
}
