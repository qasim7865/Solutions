/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Mishalbukhari
 */
public class EventDemo {
    public static void main(String[] args) {
        Event event1 = new Event();
        String eventNumber = KhizarsEventPriceWithMethods.getEventNumber();
        int guests = KhizarsEventPriceWithMethods.getInputFromUser();
        
        event1.setEventNumber(eventNumber);
        event1.setGuests(guests);
        
        KhizarsEventPriceWithMethods.displayCompanyMottoWithBorder();
        KhizarsEventPriceWithMethods.computePrice(event1);
        
    }
}
