/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Maarij Malik
 */
public class Event{
    public static int pricePerGuest = 35;
    public static int cutOffValue = 50;
    private String eventNumber;
    private int noOfGuests;
    private double totalPrice;

    public void setEventNumber(String eNumber)
    {
       eventNumber = eNumber;
    }
    public void setGuests(int guestsNum)
    {
        noOfGuests = guestsNum;
        totalPrice = pricePerGuest * noOfGuests;
    }
    public String getEventNumber()
    {
        return eventNumber;
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
