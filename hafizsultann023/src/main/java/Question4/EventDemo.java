/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class EventDemo {
    public EventDemo(int numberofGuests, String evnumber) {
        this.numberofGuests = numberofGuests;
        this.evnumber = evnumber;
    }
    public static void relateMethod(){
        EventDemo a=new EventDemo(23,"GH12");
        System.out.println(a.numberofGuests);
        System.out.println(a.evnumber);
    }
    public static void eventInfo(String evnumber,int numberofGuests){
        System.out.println("vent nuo are :"+evnumber);
        System.out.println("no of guests are:  " +numberofGuests);
    }
    int numberofGuests;
    String evnumber;
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        int g;
        String h;
        relateMethod();
        System.out.println("enter ev no:");
        h=s.nextLine();
        System.out.println("enter no of guests:");
        g=s.nextInt();
        eventInfo(h,g);
    }
    
}
