/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author User
 */
public class Event {
    public static int priceEachGuest = 35;
    public static int cutOff = 50;
    private String eNum ;
    private int numGuest;
    private double total_price;
    public Event() {
        eNum = "";
        numGuest = 0;
        total_price = 0;
    }
    public void setEventNum(String eNum) {
        this.eNum = eNum;
    }
    public void setNumGuest(int numGuest) {
        this.numGuest = numGuest;
        price(numGuest);
    }
    private void price(int numGuest) {
        total_price = numGuest*priceEachGuest;
    }
    public String getEventNum() {
        return eNum;
    }
    public int getnumGuest() {
        return numGuest;
    }
    public double getTotalPrice () {
        return total_price;
    }   
    
}
