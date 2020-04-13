/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class EventDemo {

    

    

   
    public static int numberofGuests(int g){
        System.out.println("num of guests are : " +g);
        return g;
    }
    public static void eventNumber(String a){
        System.out.println("num of event are: "+a);
    }
    public static void eventsDetail(){
        Scanner s=new Scanner(System.in);
        boolean e;
        int c;
        int h;
        System.out.println("enter the no of guests:");
        c=s.nextInt();
        h=c*35;
        System.out.println("no of guests are : " +c);
        System.out.println("price per head of guest is $35:");
        System.out.println("total price is :"+h);
        if (c>=50)
        {
            e=true;
            System.out.println(e);
        }
        else
        {
            e=false;
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int f;
        String d="31ASD";
        System.out.println("enter the no of guest");
        f=s.nextInt();
        numberofGuests(f);
        eventNumber(d);
        EventPriceWithMethods.mottowithBorder();
        eventsDetail();
    
    }

    private static class EventPriceWithMethods {

        private static void mottowithBorder() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public EventPriceWithMethods() {
        }
    }
}

