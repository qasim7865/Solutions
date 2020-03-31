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
public class Event {
    public final static int pricePerGuest = 35;
    public final static int cutOffValue = 50;
    
    private String eventNumber;
    private int Guests;
    private double price;
    
    private boolean eventSize;

    public Event(String eventNumber, int Guests) {
        setEventNumber(eventNumber);
        setGuests(Guests);
    }

    public Event() {
        this("A000" , 0);
    }

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setGuests(int Guests) {
        this.Guests = Guests;
        this.price = Guests*pricePerGuest;
        if (Guests>=cutOffValue){
            eventSize = true;
        } else{
            eventSize = false;
        }
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getGuests() {
        return Guests;
    }

    public double getPrice() {
        return price;
    }

    public boolean isEventSize() {
        return eventSize;
    }
    
    
    
}
