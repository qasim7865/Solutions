/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import question5.*;
import question4.*;
import question3.*;

/**
 *
 * @author Mishalbukhari
 */
public class Event {
    public static final int higherPricePerGuest = 35;
    public static final int lowerPricePerGuest = 32;
    public static final int cutOffValue = 50;
    
    private String eventNumber;
    private int Guests;
    private int price;
    private int pricePerGuest;
    Event(String eventNumber,int Guests){
        setEventNumber(eventNumber);
        setGuests(Guests);
    }

    Event(){
        this("A000",0);
    }

    public int getPricePerGuest() {
        return pricePerGuest;
    }
    
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setGuests(int Guests) {
        this.Guests = Guests;
        if (isLargeEvent()){
            pricePerGuest=lowerPricePerGuest;
        }else{
            pricePerGuest=higherPricePerGuest;
        }
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
    
    public boolean isLargeEvent(){
        if (Guests>=50){
            return true;
        }else{
            return false;
        }
    }
    
}
