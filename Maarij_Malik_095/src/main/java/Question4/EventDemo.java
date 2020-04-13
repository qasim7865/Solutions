/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;
import Question3.KhizarsEventPriceWithMethods;

/**
 *
 * @author Maarij Malik
 */
public class EventDemo {
    
public static void displayEventDetails(Event e)
    {
        System.out.println("\nEvent number: " + e.getEventNumber());
        System.out.println("Number of guests attending the event: " + e.getGuestsNumber());
        System.out.println("Catering price per guest: " + 35);
        System.out.println("Total catering price: " + e.getGuestsNumber()*35);
        if (e.getGuestsNumber() >=50)
        {
            System.out.println("The job is a large event.");
        }
        else
        {
            System.out.println("The job is not a large event.");
        }
    }
    public static void main(String[] Args)
    {
        int noOfGuests = KhizarsEventPriceWithMethods.guestsInput();
        String eventNumber = KhizarsEventPriceWithMethods.eventNumberInput();
        Event e1 = new Event();
        Event e2 = new Event();
        e2.setEventNumber(eventNumber);
        e2.setGuests(noOfGuests);
        KhizarsEventPriceWithMethods.displayMotto();
        displayEventDetails(e1);
        System.out.println("\n\n");
        KhizarsEventPriceWithMethods.displayMotto();
        displayEventDetails(e2);
    }
}
