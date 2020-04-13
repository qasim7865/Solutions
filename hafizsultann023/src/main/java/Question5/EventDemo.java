/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class EventDemo {
   
    int numberofGuests;
    String evnumber;
    private String evenumber;
    private int guests;
    private int p;
    final static int lowerpriceperGuest=32;
    final static int higherpriceperGuest=35;
    public static void eventNumber(){
        String h;
System.out.println("enter event no:");
        Scanner s=new Scanner(System.in);
        h=s.nextLine();
        System.out.println("event no is: "+h);
    }
    public static void Guests(){
        int d;
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of guests:");
        d=s.nextInt();
        System.out.println("no of guests are :"+d);
        
            }
    public static void P(){
        int a;       
 Scanner s=new Scanner(System.in);
        System.out.println("rnter price per head of guest:");
        a=s.nextInt();
        System.out.println("price is :" +a);
    }
    public static void LargerEvent(int numberofGuests){
        Scanner s =new Scanner(System.in);
        EventDemo c=new EventDemo();

boolean e;
        System.out.println("enter the no of guests: ");
        numberofGuests=s.nextInt();
        if (numberofGuests>=50)
        {
            e=true;
            System.out.println("event is larger: "+e);
            c.p=c.lowerpriceperGuest;
            System.out.println(c.p);
            System.out.println("total event price is :"+c.p*32);
        }
             else
        {
            e=false;
            System.out.println("event is small: "+e);
            c.p=c.higherpriceperGuest;
            System.out.println(c.p);
            System.out.println("total event price are: "+c.p*35);
        }

    
    public static void largeEvent(int number1,String event1,int number2,String event){
      System.out.println("event 1 has no of guests  "+number1);
      System.out.println("event one is  "+event1);
        
      System.out.println("event two has no of guest:  "+number2);
        
     
       
      System.out.println("event two is : "+event);

        if (number1>number2){
            System.out.println("event one is larger. "+number1);
        }
        if (number1==number2)
        {
            System.out.println("no of guests in both events are equal "+number1  +number2);
        }
        if (number1<number2)
        {
            System.out.println("event 2 is larger event "+number2);
        }
    }
   
    public static void main(String[] args) {
        
        eventNumber();
        Guests();
        P();
        Scanner s=new Scanner(System.in);
        int g;
        System.out.println("enter guests to check event is large or not:");
        g=s.nextInt();
        LargerEvent(g);
        largeEvent(22,"22AA",43,"44EF");
        largeEvent(32,"26GH",44,"73TT");
        largeEvent(43,"108S",51,"19MN");


    }
    
}
