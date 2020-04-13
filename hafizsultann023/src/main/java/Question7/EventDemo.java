/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class EventDemo {
    public String getPhNo(){
    return phNo;
        
    }
    String phNo;
    public void eventNo(char a,int b,int c,int d){
         System.out.println("event no is:");
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println(d);
         
    }
    public void phNo(){
        Scanner s=new Scanner(System.in);
        String c;
        System.out.println("enter ph no:");
        c=s.nextLine();
        System.out.println("Ph No is "+c.replaceAll("[^0-9]",""));
          {
          if(c.length()<12 || c.length()>12)
              c="0000000000";
          System.out.println("no of gigits are:"+c);
    }
    }
    public static void mottoWiithBorder(){
        System.out.println("*******************************************"+"*Khizar makes a food that makes it a party*"+"*******************************************");
            
        
     
    }
    

    
    public static void eventData(int c){
             boolean e;
             int b;
             b=c*35;
             System.out.println("no of guests is:"+c);
             System.out.println("price per head of guest is 35");
             System.out.println("total price:"+b);
             if(c>=50){
                 e=true;
             System.out.println("larger event:"+e);
             }
             else
             {
                 e=false;
             System.out.println("larger event not:"+e);
             }
    }
                  public static void main(String[] args) {
                      EventDemo j=new EventDemo();
                      Scanner s=new Scanner(System.in);
                      int g;
                      System.out.println("eneter no of guest:");
                      g=s.nextInt();
                      char a;
                      int b,c,d;
                      System.out.println("enter ur event :");
                      a=s.next().charAt(0);
                      b=s.nextInt();
                      c=s.nextInt();
                      d=s.nextInt();
                      j.eventNo(a,b,c,d);
                      j.phNo();
                      j.mottoWiithBorder();
                      j.eventData(g);
                  }

    
    
             }
    

