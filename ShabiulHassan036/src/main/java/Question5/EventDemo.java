/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Talha
 */

    public class EventDemo {
    public static void main(String[] args){
        System.out.println("Enter Event number and guests for 1st event");
        Event a=new Event(KhizarsEventPrice.getEventNumber(),KhizarsEventPrice.getGuests());
        System.out.println("Enter Event number and guests for 2nd event");
        Event b=new Event(KhizarsEventPrice.getEventNumber(),KhizarsEventPrice.getGuests());
        System.out.println("Enter Event number and guests for 3rd event");
        Event c=new Event(KhizarsEventPrice.getEventNumber(),KhizarsEventPrice.getGuests());
        a.CalculateRent(a.getNumberOfGuests(), a.getEventNumber());
        System.out.println(a.getPrice()+" dollars");
        b.CalculateRent(b.getNumberOfGuests(),b.getEventNumber());
        System.out.println(b.getPrice()+" dollars");
        c.CalculateRent(c.getNumberOfGuests(), c.getEventNumber());
        System.out.println(c.getPrice()+" dollars");
        CompareEvent(a,b);
    }
    public static void CompareEvent(Event a, Event b){
        if(a.getNumberOfGuests()>b.getNumberOfGuests()){
            System.out.println("Event a is larger then b");
        }
        else{
            System.out.println("Event b is larger than a");
        }
    }
    
}
