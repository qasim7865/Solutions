/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion8;

/**
 *
 * @author princ
 */
public class EventDemo {
    public static void main(String[] args) {
      Event[] event = {new Event(),new Event(), new Event()};
      
      for (int i=0; i<event.length; i++){
          event[i].setEventNumber(KhizarsEventPriceWithMethods.getEventNumber());
          event[i].setGuests(KhizarsEventPriceWithMethods.guestsInput());
          event[i].setPhoneNumber(KhizarsEventPriceWithMethods.getPhoneNumber());
          event[i].setEventType(KhizarsEventPriceWithMethods.getEventType());
      }
     
      for (int j=0; j<event.length; j++){
          System.out.println(event[j].getEventNumber());
          System.out.println(event[j].getGuests());
          System.out.println(event[j].getPhoneNumber());
          System.out.println(event[j].getPrice());
          System.out.println(event[j].getPricePerGuest());
          System.out.println(event[j].getEventType());
      }
    }
}
