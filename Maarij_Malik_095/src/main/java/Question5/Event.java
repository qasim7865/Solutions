/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Maarij Malik
 */
public class Event {
  public static int lowerPricePerGuest = 32;
    public static int higherPricePerGuest = 35;
    public static int cutOffValue = 50;
    private String eventNumber;
    private int pricePerGuest;
    private int noOfGuests;
    private double totalPrice;

    public Event()
    {
        this("A000", 0);
    }
    public Event(String eNumber, int guestsNum)
    {
        setEventNumber(eNumber);
        setGuests(guestsNum);
    }
    public void setEventNumber(String eNumber)
    {
        eventNumber = eNumber;
    }
    public void setGuests(int guestsNum)
    {
        noOfGuests = guestsNum;
        if(isLargeEvent())
            pricePerGuest = lowerPricePerGuest;
        else
            pricePerGuest = higherPricePerGuest;
        totalPrice = pricePerGuest * noOfGuests;
    }
    public String getEventNumber()
    {
        return eventNumber;
    }
    public int getPricePerGuest()
    {
        return pricePerGuest;
    }
    public boolean isLargeEvent()
    {
        if(noOfGuests >= 50)
            return true;
        return false;
    }
    public int getGuestsNumber()
    {
        return noOfGuests;
    }
    public double getTotalPrice()
    {
        return totalPrice;
    }

}


