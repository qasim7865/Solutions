/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;
import Question1.KhizarsMotto2;
import Question3.KhizarsEventPriceWithMethods;
import java.util.Scanner;

/**
 *
 * @author Maarij Malik
 */
public class EventDemo 
{
    public static void displayEventDetails(Event e)
    {
        System.out.println("\nEvent number: " + e.getEventNumber());
        System.out.println("Event type: " + e.getEventType());
        System.out.println("Contact Number: " + e.getPhoneNumber());
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
    public static String phoneNumberInput()
    {
        String phNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a contact number: ");
        phNumber = input.nextLine();
        return phNumber;
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
        Event events[] = {new Event(), new Event(), new Event()};
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
            int eventType;
            Scanner input = new Scanner(System.in);
            System.out.print("Select an event type: 0 for Wedding, 1 for Baptism, 2 for Birthday," +
                    " 3 for Corporate, 4 for Other: ");
            eventType = input.nextInt();
            String phoneNumber = phoneNumberInput();
            String eNumber = KhizarsEventPriceWithMethods.eventNumberInput();
            events[i].setEventNumber(eNumber);
            events[i].setGuests(noOfGuests);
            events[i].setPhoneNumber(phoneNumber);
            events[i].setEventType(eventType);
        }
        for(int i = 0; i < 3; i++)
        {
            KhizarsMotto2.main(null);
            displayEventDetails(events[i]);
            System.out.println("\n");
        }
    }
}
    

