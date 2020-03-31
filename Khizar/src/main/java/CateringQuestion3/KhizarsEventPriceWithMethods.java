/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author princ
 */
public class KhizarsEventPriceWithMethods {
    private static final int pricePerPerson = 35;
    private static int numberOfGuests;
    private static double price;
    private static boolean eventSize;
    static Scanner keyboard = new Scanner(System.in);
    public static int guestsInput(){        
        numberOfGuests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of guests"));
        if (numberOfGuests >=50){
            eventSize = true;
        } else {
            eventSize = false;
        }
        return numberOfGuests;
    }
    public static void computeBill(Event e){
        price = e.getGuests() * e.getPrice();
        System.out.println("The number of guests = " + e.getGuests());
        System.out.println("The price per guest = " + e.pricePerGuest);
        System.out.println("The total price is = " + e.getPrice());
        System.out.println("The event is a large event = " + eventSize);
    }
    
    public static String getEventNumber(){
        System.out.println("Enter the event number");
        
        return keyboard.nextLine();
    }
}
