/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion6;

/**
 *
 * @author princ
 */
public class EventDemo {
    public static void main(String[] args) {
        
        /*
        int guests = 10;
        while (guests>=5 && guests<=100){
            guests = KhizarsEventPriceWithMethods.guestsInput();
        }*/
        
        Event a = new Event ("A000", 40);
        for (int i=0; i<a.getGuests(); i++){
            System.out.println("Please come to my event!");
        }
    }
}
