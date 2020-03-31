/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion3;

/**
 *
 * @author princ
 */
public class EventDemo {
    public static void main(String[] args) {
        Event e = new Event();
        e.setGuests(KhizarsEventPriceWithMethods.guestsInput());
        e.setEventNumber(KhizarsEventPriceWithMethods.getEventNumber());
        KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(e);
    }
}
