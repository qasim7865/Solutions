/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class EventDemo {
    int numberofGuests;
    String evnumber;
    private String evno;
    private int guests;
    private int p;
     public static void largeEvent(int number1,String event1,int number2,String event){
       System.out.println("Event 1 has no of guests  "+number1);
       System.out.println("event one is  "+event1);
       System.out.println("event two has no of guests  "+number2);
       
        System.out.println("Event two is  "+event);
        if (number1>number2){
            System.out.println("one event is large "+number1);
        }
        if (number1==number2)
   {
     System.out.println("guests of both events are equal "+number1  +number2);
        }
        if (number1<number2)
        {
            System.out.println("event 2 is larger event "+number2);
        }
    }
    public static void Price(){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter price per head for guest");
        a=s.nextInt();
        System.out.println("Price is: " +a);
    }
    public static void eventNumber(){
        int event1,event2;
        Scanner s=new Scanner(System.in);
        
            System.out.println("enter no of guests for event 1");
            event1=s.nextInt();
            System.out.println("enter no of guests for event 2");
        int event = s.nextInt();
            if (event1!=5 && event1>100 && event!=5 && event>100)
            {
            System.out.println("Enter the no of guests for event 1");
            event1=s.nextInt();
            System.out.println("Enter the no of guests for event 2");
            event=s.nextInt();
            }
            }
    public static void Guests(){
        EventDemo b=new EventDemo();
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("enter no of guests");
            a=input.nextInt();
        for (int i=1;i<=a;i++)
        {
            System.out.println("plz come to my event:");
        }
}
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Guests();
        eventNumber();
        Price();
        largeEvent(43,"43GG",54,"54EE");
    }
    
}
