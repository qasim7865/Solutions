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
public class Event {
    int p;
    final static int lowerpriceperGuest=32;
    final static int higherpriceperGuest=35;
    public static void returnedToValue(){
        Event a=new Event();
        System.out.println(a.lowerpriceperGuest);
        System.out.println(a.higherpriceperGuest);
    }
    public static void LargerEvent(){
        Scanner s =new Scanner(System.in);
        Event c=new Event();
        boolean e;
        int guests;
        System.out.println("enter the no of guests: ");
        guests=s.nextInt();
        if (guests>=50)
        {
e=true;
            System.out.println("event is large: "+e);
            c.p=c.lowerpriceperGuest;
            System.out.println(c.p);
            System.out.println("total event price are: "+c.p*32);
        }
        else
        {
            e=false;
            System.out.println("event is small :"+e);
            c.p=c.higherpriceperGuest;

System.out.println(c.p);
            System.out.println("total event price is: "+c.p*35);
        }
    }
    
    public static void main(String[] args) {
        returnedToValue();
        LargerEvent();
    }
    
    
}
