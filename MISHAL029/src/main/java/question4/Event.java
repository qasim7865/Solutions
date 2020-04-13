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
public class Event {
    public static final int pricePerGuest = 35;
    public static final int cutOffValue = 50;
    
    private String eventNumber;
    private int Guests;
    private int price;
    Event(String eventNumber,int Guests){
        setEventNumber(eventNumber);
        setGuests(Guests);
    }

    Event(){
        this("A000",0);
    }
    
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

    public int getPrice() {
        return price;
    }
    
    
}
