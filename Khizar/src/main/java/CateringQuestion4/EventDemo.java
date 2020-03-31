/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion4;

/**
 *
 * @author princ
 */
public class EventDemo {
    public static void main(String[] args) {
        Event e = new Event();
        Event b = new Event(KhizarsEventPriceWithMethods.getEventNumber(),KhizarsEventPriceWithMethods.guestsInput());
        CateringQuestion1.KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(e);
        CateringQuestion1.KhizarsMotto2.displayMottoWithBorder();
        KhizarsEventPriceWithMethods.computeBill(b);
    }
}
