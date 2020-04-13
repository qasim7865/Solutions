/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author Shahzaib
 */
public class Event {
         private String Number;
         private int Member ;
         private int Price;
         static  int pp=35;
         static final  int  co=50;
    public int GetMember() {
         System.out.println("Khizer's makes the food that makes it a beautiful Party");
           
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of people in event");
        int x= input.nextInt();
        return Member=x;
       
    }
    public void setMember(int Member) {
         System.out.println("Total peoples in event  " + Member);
        this.Member = Member;
    }
    public String getNumber() {
        return Number;
    }
    public String setNumber() {
             return "m1000";
   }
    public void setPrice(int TOTALPrice) {
        this.Price = TOTALPrice;         }
    
    public void getPrice(int TOTALPrice) {
        System.out.println("Total Price  "+TOTALPrice);
        this.Price = TOTALPrice;         }
        public static void main(String[] args) {
              Event e1=new Event();
        int x = e1.getMember();
        e1.setMember(x);
        e1.getNumber();
        System.out.println();
        String name =  e1.setNumber();
        System.out.println("NAME : "+name);
        
        e1.setPrice(pp);
        e1.getPrice(pp*x);
        System.out.println("per price ="+pp+"$");
        
      
 
}

    private int getEventMember() {
        throw new UnsupportedOperationException("Not supported ");
    }

    private int getMember() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

