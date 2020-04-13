/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

/**
 *
 * @author Talha
 */

    public class EventDemo {
    public static void main(String[] args){
        Event a=new Event("A200",54);
        a.setContactNumber("0349123456");
        a.CalculateRent(a.getNumberOfGuests(), a.getEventNumber());
    }
    
}

