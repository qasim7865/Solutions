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
public class Event {
    public final static int higherPricePerGuest = 35;
    public final static int lowerPricePerGuest = 32;
    public final static int cutOffValue = 50;
    
    private String eventNumber;
    private int Guests;
    private double price;
    private double pricePerGuest;
    
    private boolean largeEvent;

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
        if (Guests>=cutOffValue){
            largeEvent = true;
        } else{
            largeEvent = false;
        }
        if (isLargeEvent()){         
            this.pricePerGuest = lowerPricePerGuest;
        } else if(isLargeEvent()==false){
            this.pricePerGuest = higherPricePerGuest;
        }
        
        this.price = pricePerGuest * Guests;
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

    public boolean isLargeEvent() {
        return largeEvent;
    }

    public double getPricePerGuest() {
        return pricePerGuest;
    }
    
    
    
}
