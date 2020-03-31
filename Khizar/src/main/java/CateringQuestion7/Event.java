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
public class Event {
    public final static int higherPricePerGuest = 35;
    public final static int lowerPricePerGuest = 32;
    public final static int cutOffValue = 50;
    
    private String eventNumber;
    private int Guests;
    private double price;
    private double pricePerGuest;
    
    private String phoneNumber;
    
    private boolean largeEvent;

    public Event(String eventNumber, int Guests) {
        setEventNumber(eventNumber);
        setGuests(Guests);
    }

    public Event() {
        this("A000" , 0);
    }

    public void setEventNumber(String eventNumber) {
        if (eventNumber.length()==4 && Character.isLetter(eventNumber.charAt(0))&&Character.isDigit(eventNumber.charAt(1))&&Character.isDigit(eventNumber.charAt(2))&&Character.isDigit(eventNumber.charAt(3))){
            Character.toUpperCase(eventNumber.charAt(0));
            this.eventNumber = eventNumber;
        }else{
            this.eventNumber="A000";
        }        
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

    public String getPhoneNumber() {
        return phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public void setPhoneNumber(String phoneNumber) {
        StringBuilder phone = new StringBuilder(15);
        for (int i=0; i<phoneNumber.length(); i++){
            if (Character.isDigit(phoneNumber.charAt(i))){
                 phone.append(phoneNumber.charAt(i));
            }
        }
        if (phone.length()<10 || phone.length()>10){
            phone=null;
            phone = new StringBuilder(10);
            phone.append("0000000000");
        }
        this.phoneNumber = phone.toString();
    }
    
    
    
}
