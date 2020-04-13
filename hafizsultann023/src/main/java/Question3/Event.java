/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author hafizabdulmalik
 */
public class Event {
public void setEvnumber(String event) {
        this.evnumber = evnumber;
    }

    public void setGuests(int numberofguests) {
        this.guests =guests;
        prc=guests*c;
        if (guests>=50)
        {
            prc=prc-d;
            System.out.println(prc);
                    }
        else
        {
            System.out.println("large event not "+prc);
        }
    }

    public String getEvnumber() {
        return evnumber;}

    /**
     *
     * @return
     */
    public int getGuests() {
        return guests;
    }

    public int getPrc() {
        return prc;
    }
    public final static int c=35;
    public final static int d=10;
    private String evnumber;
    private int guests;
    private int prc;
    
   public static void main(String[] args) {
        Event c=new Event();
            
        c.evnumber="M312";
        c.guests=35;
        System.out.println(c.evnumber);
        System.out.println(c.guests);
        c.setGuests(40);
    }

   
   
    }
    

