/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author hafizabdulmalik
 */
public class Event {
    public String getEvnumber() {
        return evnumber;
    }

    public int getGuests() {
        return guests;
    }

    public Event(String evnumber, int guests) {
        this.evnumber = evnumber;
        this.guests = guests;
    }
    public Event(){
        Event a=new Event("21bb",7);
        System.out.println(a.evnumber);
        System.out.println(a.guests);
        a.setGuests(50);
    }
    public void setEvno(String evnumber) {
        this.evnumber = evnumber;
    }
        public void setGuests(int guests) {
        this.guests = guests;
        p=a*guests;
        if(guests>=50)
        {
            p=p-b;
            System.out.println(p);}
        }
                public final static int a=35;
    public final static int b=10;
    private String evnumber;
    private int guests;
    private int p;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Event d=new Event();
    }
    
}
