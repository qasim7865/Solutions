/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author M.Hamza
 */
public class EventDemo {
    int noofGuests;
    String eveno;
    private String evno;
    private int guests;
    private int price;
  public static void largerEvent(int no1,String event1,int no2,String event2){
       System.out.println("Event 1 has number of guests  "+no1);
       System.out.println("event number one is  "+event1);
       System.out.println("Event two has number of guests  "+no2);
        System.out.println("Event number two is  "+event2);
        if (no1>no2){
            System.out.println("event one is larger "+no1);
        }
        if (no1==no2)
   {
     System.out.println("no of guests in both events are equal "+no1  +no2);
        }
        if (no1<no2)
        {
            System.out.println("event 2 is larger event "+no2);
        }
    }
    public static void Price(){
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter price per guest");
        a=input.nextInt();
        System.out.println("Price is " +a);
    }
    public static void eventNo(){
        int event1,event2;
        Scanner input=new Scanner(System.in);
        
            System.out.println("Enter the number of guests for event 1");
            event1=input.nextInt();
            System.out.println("Enter the number of guests for event 2");
            event2=input.nextInt();
            if (event1!=5 && event1>100 && event2!=5 && event2>100)
            {
            System.out.println("Enter the number of guests for event 1");
            event1=input.nextInt();
            System.out.println("Enter the number of guests for event 2");
            event2=input.nextInt();
            }
        
    }
    public static void Guests(){
        EventDemo b=new EventDemo();
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of guests");
            a=input.nextInt();
        for (int i=1;i<=a;i++)
        {
            System.out.println("Please come to my event !");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guests();
        eventNo();
        Price();
        largerEvent(34,"34FF",45,"45HH");
    }
  }


