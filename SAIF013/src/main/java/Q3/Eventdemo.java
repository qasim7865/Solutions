/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author Lenovo
 */
public class Eventdemo {
    public static void dispaly(){
        Event obj =new Event();  
        String a=obj.getEventNumber();
        int b=obj.getNoOfGuest();
        int c=obj.price(b);
        System.out.println("event no ="+a);
        System.out.println("no of guest ="+b);
        System.out.println("price="+c);
        
              
    }
    public static void main (String []args){
        khizareventpricewithmethod.displayMotto();
          Eventdemo.dispaly();
          
         
             }
    
    
}
