/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;


import java.util.Scanner;

/**
 *
 * @author Mishalbukhari
 */
public class KhizarsEventPriceWithMethods {
    public static void main(String[] args) {
        int guests = getInputFromUser();
        displayCompanyMottoWithBorder();
        computePrice(guests);
    }

    public static int getInputFromUser() {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of guests");
        int guests = input.nextInt();
        return guests;
    }
    
    public static String getEventNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the event number");
        String eventNumber = input.nextLine();
        return eventNumber;
    }
    
    public static void displayCompanyMottoWithBorder(){
        question1.KhizarsMotto2.displayMotto();
    }

    public static void computePrice(int guests) {
        int totalPrice = guests * 35;
        boolean largeEvent;
        
        if (guests <50){
            largeEvent = false;
        }else{
            largeEvent = true;
        }
        
        System.out.println("Total number of guests = " + guests);
        System.out.println("Price per guests = " + 35);
        System.out.println("The total price is = "+ totalPrice);
        System.out.println("The event is large = " + largeEvent);
    }
    public static void computePrice(Event e) {
        int totalPrice = e.getGuests() * e.pricePerGuest;
        boolean largeEvent;
        
        if (e.getGuests() <50){
            largeEvent = false;
        }else{
            largeEvent = true;
        }
        System.out.println("The event number is = " + e.getEventNumber());
        System.out.println("Total number of guests = " + e.getGuests());
        System.out.println("Price per guests = " + e.pricePerGuest);
        System.out.println("The total price is = "+ totalPrice);
        System.out.println("The event is large = " + largeEvent);
    }
    
}
