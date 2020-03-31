/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion7;

/**
 *
 * @author princ
 */
public class EventDemo {
    public static void main(String[] args) {
      Event a = new Event();
      a.setEventNumber(KhizarsEventPriceWithMethods.getEventNumber());
      a.setGuests(KhizarsEventPriceWithMethods.guestsInput());
      a.setPhoneNumber(KhizarsEventPriceWithMethods.getPhoneNumber());
      
        System.out.println(a.getEventNumber());
        System.out.println(a.getGuests());
        System.out.println(a.getPhoneNumber());
     
    }
}
