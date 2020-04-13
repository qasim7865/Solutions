/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author M.Hamza
 */
public class Event {
    public String getEvno() {
        return evno;
    }

    public int getGuests() {
        return guests;
    }

    public Event(String evno, int guests) {
        this.evno = evno;
        this.guests = guests;
    }
    public Event(){
        Event a=new Event("31dd",5);
        System.out.println(a.evno);
        System.out.println(a.guests);
        a.setGuests(50);
    }
    public void setEvno(String evno) {
        this.evno = evno;
    }

    public void setGuests(int guests) {
        this.guests = guests;
        price=a*guests;
        if(guests>=50)
        {
            price=price-b;
            System.out.println(price);
        }
    }

    
    public final static int a=35;
    public final static int b=10;
    private String evno;
    private int guests;
    private int price;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Event a=new Event();
    }
    
}


