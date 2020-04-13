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

    public final class Event {
     public final static int lowerpricepGuest=32;
     public final static int higherpricepGuest=35;
    public final static int largeEvent=50;
    private String EventNumber;
    private int NumberOfGuests;
    private int price;
    
     public Event(){
        this("A000",0);
    }
    
    public Event(String EventNumber,int guests){
        this.EventNumber=EventNumber;
        this.NumberOfGuests=guests;
        setNumberOfGuests(NumberOfGuests);
        setEventNumber(EventNumber);
    }
    public int isLargeEvent(){
        if (NumberOfGuests>=50){
            return 1;
        }
        else{
            return 0;
        }
    }

    public void setEventNumber(String EventNumber) {
        this.EventNumber = EventNumber;
    }

    public void setNumberOfGuests(int NumberOfGuests) {
        this.NumberOfGuests = NumberOfGuests;
        if(isLargeEvent()==1){
            price=NumberOfGuests*lowerpricepGuest;
        }
        else{
            price=NumberOfGuests*higherpricepGuest;
        }
    }

    public String getEventNumber() {
        return EventNumber;
    }

    public int getNumberOfGuests() {
        return NumberOfGuests;
    }

    public int getPrice() {
        return price;
    }
    public void CalculateRent(int NumberOfGuests,String EventNumber){
        
        
        
        
        System.out.println("Event Number:"+EventNumber);
        System.out.println("number of guests: "+NumberOfGuests);
        if(isLargeEvent()==1){
            System.out.println("price per guest: "+lowerpricepGuest);
        }
        else{
            System.out.println("price per guest: "+higherpricepGuest);
        }
        
        if(NumberOfGuests>=50){
            System.out.println("large event");
        }
        else{
            System.out.println("Small Event");
        }
    }
}
    

