/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Event {
    public final static int pricePerGuest=35;
     public final static int cutOffValue=50;
     private String eventNumber;
     private int noOfGuest;
     private static int Price;

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }
public static int price(int g){
    int P=pricePerGuest*g;
    return P;
}
    public  void setNoOfGuest(int noOfGuest) {
        this.noOfGuest = noOfGuest;
        Price=pricePerGuest*noOfGuest;
    }

    public static String getEventNumber() {
        Scanner input= new Scanner(System.in);
         System.out.println("enter event no");
        String n=input.nextLine();
        return n;
      
    }

    public static int getNoOfGuest() {
        Scanner input= new Scanner(System.in);
         System.out.println("enter no of guest");
        int a=input.nextInt();
        return a;
    }

    public static int getPrice() {
        return Price;
    }
     public static void main(String[] args) {
      String h=Event.getEventNumber();
         System.out.println("event no is "+h);
         int f=Event.getNoOfGuest();
         System.out.println("no of guest"+f);
         System.out.println("price = "+Event.price(f));
   }
     
    
}
