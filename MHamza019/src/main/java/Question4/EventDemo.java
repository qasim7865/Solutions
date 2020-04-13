/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

import java.util.Scanner;

/**
 *
 * @author M.Hamza
 */
public class EventDemo {
  public EventDemo(int noofGuests, String eveno) {
        this.noofGuests = noofGuests;
        this.eveno = eveno;
    }
    public static void retainMathod(){
        EventDemo a=new EventDemo(77,"DC12");
        System.out.println(a.noofGuests);
        System.out.println(a.eveno);
    }
    public static void eventDetails(String eveno,int noofGuests){
        System.out.println("Event number is "+eveno);
        System.out.println("Number of guests are  " +noofGuests);
    }
    int noofGuests;
    String eveno;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int a;
        String b;
        retainMathod();
        System.out.println("Enter the event number");
        b=input.nextLine();
        System.out.println("Enter the number of guests");
        a=input.nextInt();
        eventDetails(b,a);
    }
    
}
   

