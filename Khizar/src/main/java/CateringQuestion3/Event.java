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
public class Event {
    public final static int pricePerGuest = 35;
    public final static int cutOffValue = 50;
    
    private String eventNumber;
    private int Guests;
    private double price;

    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setGuests(int Guests) {
        this.Guests = Guests;
        this.price = Guests*pricePerGuest;
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
    
    
    
}
