/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Eventdemo {
     public final static int pricePerGuest=35;
     public final static int cutOffValue=50;
     private String eventNumber;
     private int noOfGuest;
     private static int Price;

    public void setEventNumber(String eventNumber) {
        
        this.eventNumber = eventNumber;
    }

    public void setNoOfGuest(int noOfGuest) {
        int wx=noOfGuest*pricePerGuest;
        this.noOfGuest = wx;
    }

    public String getEventNumber() {
        Scanner input=new Scanner(System.in);
        System.out.println("enter event no");
        String st=input.nextLine();
        return st;
    }

    public int getNoOfGuest(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter event no");
        int ab= input.nextInt();
        return ab;
    }

    public static int getPrice() {
        return Price;
    }

    public Eventdemo(String eventNumber, int noOfGuest) {
        this.eventNumber = eventNumber;
        this.noOfGuest = noOfGuest;
    }
    Eventdemo(){
        this("A000",0);
        
    }

    
   
     
    public static void main (String []args){
        Eventdemo obj1=new Eventdemo();
        Eventdemo obj2=new Eventdemo();
        System.out.println("defualt const values");
        System.out.println("deafalut event no"+obj1.eventNumber);
        System.out.println("deafalut guest no"+obj1.noOfGuest);
        System.out.println("main const value ");
        System.out.println("deafalut event no"+obj2.getEventNumber());
        int val=obj2.getNoOfGuest();
         System.out.println("deafalut guest no"+val);
         System.out.println("price = "+obj2.getNoOfGuest());
        
        
         
             }
    
    
}
