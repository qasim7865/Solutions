/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Maarij Malik
 */
public class Event
{
    public static int lowerPricePerGuest = 32;
    public static int higherPricePerGuest = 35;
    public static int cutOffValue = 50;
    private String eventNumber;
    private String phoneNumber;
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
    public void setPhoneNumber(String phNumber)
    {
        phNumber = phNumber.replaceAll("\\D+","");
        if(phNumber.length() != 10)
        {
            phNumber = "0000000000";
        }
        phoneNumber = phNumber;
    }
    public String getPhoneNumber()
    {
        String resultPhNumber = "(" + phoneNumber.charAt(0) + phoneNumber.charAt(1) + phoneNumber.charAt(2)
                + ") " + phoneNumber.charAt(3) + phoneNumber.charAt(4) + phoneNumber.charAt(5) +  "-"
                + phoneNumber.charAt(6) + phoneNumber.charAt(7) + phoneNumber.charAt(8) + phoneNumber.charAt(9);
        return resultPhNumber;
    }
    public void setEventNumber(String eNumber)
    {
        if(eNumber.length() != 4)
        {
            eventNumber = "A000";
            return;
        }
        boolean isSmallAlphabet = false;
        char c = 'a';
        if(eNumber.charAt(0) >= 'A' && eNumber.charAt(0) <= 'Z' || eNumber.charAt(0) >= 'a' && eNumber.charAt(0) <= 'z')
        {
            int noOfDigits = 0;
            for(int i = 1; i < 4; i++)
            {
                if(eNumber.charAt(i) >= '0' && eNumber.charAt(i) <= '9')
                {
                    noOfDigits++;
                }
            }
            if(noOfDigits != 3)
            {
                eventNumber = "A000";
                return;
            }
            if(eNumber.charAt(0) >= 'a' && eNumber.charAt(0) <= 'z')
            {
                isSmallAlphabet = true;
                c = eNumber.charAt(0);
                int temp = (int) c;
                temp = temp - 32;
                c = (char) temp;
            }
        }
        else
        {
            eventNumber = "A000";
            return;
        }
        eventNumber = eNumber;
        String validEventNumber = "" + c + eNumber.charAt(1) + eNumber.charAt(2) + eNumber.charAt(3);
        if(isSmallAlphabet)
        {
            eventNumber = validEventNumber;
        }
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



