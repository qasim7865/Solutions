/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import question4.*;
import question3.*;

/**
 *
 * @author Mishalbukhari
 */
public class EventDemo {
    public static void main(String[] args) {
        Event event1 = new Event(KhizarsEventPriceWithMethods.getEventNumber(),KhizarsEventPriceWithMethods.getInputFromUser());
        
        Event event2 = new Event(KhizarsEventPriceWithMethods.getEventNumber(),KhizarsEventPriceWithMethods.getInputFromUser());
        
        Event event3 = new Event(KhizarsEventPriceWithMethods.getEventNumber(),KhizarsEventPriceWithMethods.getInputFromUser());
        
        
        
        KhizarsEventPriceWithMethods.displayCompanyMottoWithBorder();
        KhizarsEventPriceWithMethods.computePrice(event1);
        System.out.println("-------------------------------------");
        KhizarsEventPriceWithMethods.displayCompanyMottoWithBorder();
        KhizarsEventPriceWithMethods.computePrice(event2);
        System.out.println("-------------------------------------");
        KhizarsEventPriceWithMethods.displayCompanyMottoWithBorder();
        KhizarsEventPriceWithMethods.computePrice(event3);
        System.out.println("-------------------------------------");
        
        
    }
}
