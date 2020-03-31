/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion5;

/**
 *
 * @author princ
 */
public class EventDemo {
    public static void main(String[] args) {
        Event e = new Event();
        Event b = new Event(KhizarsEventPriceWithMethods.getEventNumber(),KhizarsEventPriceWithMethods.guestsInput());
        Event c = new Event ("AAAA", 49);
        CateringQuestion1.KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(e);
        CateringQuestion1.KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(b);
        CateringQuestion1.KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(c);
        Event largerEvent = KhizarsEventPriceWithMethods.compareEventObjects(c, b);
        CateringQuestion1.KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(largerEvent);
      
    }
}
