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
public class Event {
     int price;
    final static int lowerpriceperGuest=32;
    final static int higherpriceperGuest=35;
    public static void returnValue(){
        Event a=new Event();
        System.out.println("Lower price per guest is "+a.lowerpriceperGuest);
        System.out.println("higher price per guest is "+a.higherpriceperGuest);
    }
    public static void isLargeEvent(){
        Scanner input =new Scanner(System.in);
        Event c=new Event();
        boolean a;
        int guests;
        System.out.println("Enter the number of Guests ");
        guests=input.nextInt();
        if (guests>=50)
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        returnValue();
        isLargeEvent();
    }
    
}

