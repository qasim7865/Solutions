/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion5;

import java.util.Scanner;

/**
 *
 * @author princ
 */
public class KhizarsEventPriceWithMethods {
    
    public static int guestsInput(){ 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of guests");
        return   keyboard.nextInt();
         
    }
    public static void computeBill(Event e){        
        System.out.println("The number of guests = " + e.getGuests());
        System.out.println("The price per guest = " + e.getPricePerGuest());
        System.out.println("The total price is = " + e.getPrice());
        System.out.println("The event is a large event = " + e.isLargeEvent());
    }
    
    public static String getEventNumber(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the event number");
        
        return keyboard.nextLine();
    }
    
    public static Event compareEventObjects(Event a, Event b){
        if (a.getGuests()>=b.getGuests()){
            return a;
        }else{
            return b;
        }
        
    }
}
