/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

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
    final static int lowerpriceperGuest=32;
    final static int higherpriceperGuest=35;
    public static void eventNo(){
        String a;
        System.out.println("Enter event number");
        Scanner input=new Scanner(System.in);
        a=input.nextLine();
        System.out.println("Event number is "+a);
    }
    public static void Guests(){
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of guests");
        a=input.nextInt();
        System.out.println("Number of guests are "+a);
    }
    public static void Price(){
        int a;       
 Scanner input=new Scanner(System.in);
        System.out.println("Enter price per guest");
        a=input.nextInt();
        System.out.println("Price is " +a);
    }
    public static void isLargeEvent(int noofGuests){
        Scanner input =new Scanner(System.in);
        EventDemo c=new EventDemo();
        boolean a;
        System.out.println("Enter the number of Guests ");
        noofGuests=input.nextInt();
        if (noofGuests>=50)
        {
            a=true;
            System.out.println("Event is large "+a);
            c.price=c.lowerpriceperGuest;
            System.out.println(c.price);
            System.out.println("Total event price is "+c.price*32);
        }
        else
        {
            a=false;
            System.out.println("Event is small "+a);
            c.price=c.higherpriceperGuest;
            System.out.println(c.price);
            System.out.println("Total event price is "+c.price*35);
        }
    }    
         public static void largeEvent(int no1,String event1,int no2,String event2){
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        eventNo();
        Guests();
        Price();
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("enter Guests to check event is large or not");
        a=input.nextInt();
        isLargeEvent(a);
        largeEvent(12,"12DD",34,"12GT");
        largeEvent(23,"46HJ",44,"67JT");
        largeEvent(34,"98OP",51,"15Lm");
    }
    
}


