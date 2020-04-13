/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;
import Question3.KhizarsEventPriceWithMethods;
import Question5.Event;

/**
 *
 * @author Maarij Malik
 */
public class EventDemo
{
    public static void displayEventDetails(Event e)
    {
        System.out.println("\nEvent number: " + e.getEventNumber());
        System.out.println("Number of guests attending the event: " + e.getGuestsNumber());
        System.out.println("Catering price per guest: " + 35);
        System.out.println("Total catering price: " + e.getGuestsNumber()*35);
        if (e.isLargeEvent())
        {
            System.out.println("The job is a large event.");
        }
        else
        {
            System.out.println("The job is not a large event.");
        }
    }
    public static Event getLargerEvent(Event e1, Event e2)
    {
        System.out.println("Event 1 number: " + e1.getEventNumber() + "\nEvent 1 guests number: " + e1.getGuestsNumber());
        System.out.println("Event 2 number: " + e2.getEventNumber() + "\nEvent 2 guests number: " + e2.getGuestsNumber());
        if(e1.getGuestsNumber() > e2.getGuestsNumber())
            return e1;
        else
            return e2;
    }
    public static void main(String[] Args)
    {
        Event e1  = new Event();
        Event e2  = new Event();
        Event e3  = new Event();
        for(int i = 0; i < 3; i++)
        {
            int noOfGuests = KhizarsEventPriceWithMethods.guestsInput();
            if(!(noOfGuests >= 5 && noOfGuests <= 100))
            {
                while(!(noOfGuests >= 5 && noOfGuests <= 100))
                {
                    System.out.print("\nInvalid input(5^100); ");
                    noOfGuests = KhizarsEventPriceWithMethods.guestsInput();
                }
            }
            String eNumber = KhizarsEventPriceWithMethods.eventNumberInput();
            if(i == 0)
            {
                e1.setEventNumber(eNumber);
                e1.setGuests(noOfGuests);
            }
            else if(i == 1)
            {
                e2.setEventNumber(eNumber);
                e2.setGuests(noOfGuests);
            }
            else
            {
                e3.setEventNumber(eNumber);
                e3.setGuests(noOfGuests);
            }
        }
        KhizarsEventPriceWithMethods.displayMotto();
        displayEventDetails(e1);
        System.out.println("\n\n");
        KhizarsEventPriceWithMethods.displayMotto();
        displayEventDetails(e2);
        System.out.println("\n\n");
        KhizarsEventPriceWithMethods.displayMotto();
        displayEventDetails(e3);
        System.out.println("\n\n");
        Event largerEvent1 = getLargerEvent(e1, e2);
        System.out.println("Larger Event number: " + largerEvent1.getEventNumber() + "\nLarger Event guests number: " + largerEvent1.getGuestsNumber());
        Event largerEvent2 = getLargerEvent(e2, e3);
        System.out.println("Larger Event number: " + largerEvent2.getEventNumber() + "\nLarger Event guests number: " + largerEvent2.getGuestsNumber());
        Event largerEvent3 = getLargerEvent(e1, e3);
        System.out.println("Larger Event number: " + largerEvent3.getEventNumber() + "\nLarger Event guests number: " + largerEvent3.getGuestsNumber());
        int tempNumGuests = e2.getGuestsNumber();
        while(tempNumGuests != 0)
        {
            System.out.println("Please come to my event!");
            tempNumGuests--;
        }
    }
}
    

