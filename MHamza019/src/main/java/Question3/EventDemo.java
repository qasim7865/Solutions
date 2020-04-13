/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author M.Hamza
 */
public class EventDemo {
        public void setEvno(String evno) {
        this.evno = evno;
    }

    public void setGuests(int noofguests) {
        this.guests =guests;
        price=guests*a;
        if (guests>=50)
        {
            price=price-b;
            System.out.println(price);
        }
        else
        {
            System.out.println("not a large event "+price);
        }
    }

    public String getEvno() {
        return evno;
    }

    public int getGuests() {
        return guests;
    }

    public int getPrice() {
        return price;
    }
    public final static int a=35;
    public final static int b=10;
    private String evno;
    private int guests;
    private int price;
    /*b
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventDemo a=new EventDemo();
        a.evno="M312";
        a.guests=34;
        System.out.println(a.evno);
        System.out.println(a.guests);
        a.setGuests(45);
    }
    
}

