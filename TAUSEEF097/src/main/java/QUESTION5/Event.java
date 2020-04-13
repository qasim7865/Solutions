/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION5;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Event {
    
public final static int lppg=32;
public final static int hppg=35;
public final static int cf=50;
private String evn;
private int nog;
private int price;
private int ppg;
    public Event(String evn, int nog) {
        this.evn = evn;
        this.nog = nog;
    }

    public Event() {
        this.evn="A000";
        this.nog=0;
    }


    public void setEvn(String evn) {
        this.evn = evn;
    }
   public static boolean isLargeEvent(int nog){
        if (nog>=50)
            return true;
        else
            return false;
    }
    
    public void setNog(int nog) {
        this.nog = nog;
        if (isLargeEvent(nog) == true)
        {
            this.price=lppg*nog;
        }
        else
        {
            this.price=hppg*nog;
        }
    }
  
    public String getEvn() {
        return evn;
    }

    public int getNog() {
        return nog;
    }

    public int getPrice() {
        return price;
    }
     public int Ppg() {
        return ppg;
    }   

}
