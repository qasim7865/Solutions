/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

import question3.*;

/**
 *
 * @author Mishalbukhari
 */
public class EventDemo {
    public static void main(String[] args) {
        Event event1 = new Event();
        KhizarsEventPriceWithMethods.displayCompanyMottoWithBorder();
        KhizarsEventPriceWithMethods.computePrice(event1);
        System.out.println("----------------------------------------------------------");
        String eventNumber = KhizarsEventPriceWithMethods.getEventNumber();
        int guests = KhizarsEventPriceWithMethods.getInputFromUser();
        
        Event event2 = new Event(eventNumber,guests);
        
        
        KhizarsEventPriceWithMethods.displayCompanyMottoWithBorder();
        KhizarsEventPriceWithMethods.computePrice(event2);
        
        
    }
}
