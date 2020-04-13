/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;


/**
 *
 * @author Mishalbukhari
 */
public class EventDemo {
    public static void main(String[] args) {
        Event event1 = new Event(KhizarsEventPriceWithMethods.getEventNumber(),KhizarsEventPriceWithMethods.getInputFromUser());
        for (int i=0; i<event1.getGuests(); i++){
            System.out.println("Please come to my event");
        }
        
    }
}
