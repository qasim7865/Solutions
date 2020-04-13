/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUESTION7;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Event {
    
public final static int lppg=32;
public final static int hppg=35;
public final static int cf=50;
public String phnum="";
private String evn;
private int nog;
private int price;
private int ppg;
public String contact; 

    public void setContact() {
        
        Scanner inp1=new Scanner(System.in);     
        int count=0;
        System.out.println("Enter Phone Number (According to format) : ");
        String pnumb=inp1.nextLine();
        int len=pnumb.length();
        for(int i=0;i<len;i++)
                {
                    char x=pnumb.charAt(i);
                    if(Character.isDigit(x))
                    {
                        count ++;
                        String ss=Character.toString(x);
                        phnum=phnum.concat(ss);
                    }
                    if(count!=10)
                    {
                        phnum="";
                        phnum=phnum.concat("0000000000");
                    }
                }
    }
    public String getContact() {
        String ret="("+this.phnum.charAt(0)+this.phnum.charAt(1)+this.phnum.charAt(2)+")"+this.phnum.charAt(3)+this.phnum.charAt(4)+this.phnum.charAt(5)+this.phnum.charAt(6)+this.phnum.charAt(7)+this.phnum.charAt(8)+this.phnum.charAt(9);
        return ret;
    }    
public Event(String evn, int nog) {
        this.evn = evn;
        this.nog = nog;
    }

    public Event() {
        this.evn="A000";
        this.nog=0;
    }


    public void setEvn(String evn) {
        int len;
        len=evn.length();
        String def="A000";
        String en=evn;
        char c1,c2,c3,c4;
        c1=en.charAt(0);
        c2=en.charAt(1);
        c3=en.charAt(2);
        c4=en.charAt(3);
        if(Character.isLetter(c1) && Character.isDigit(c2) && Character.isDigit(c3) && Character.isDigit(c4)){
            en=en.toUpperCase();
            this.evn = evn.concat(en);
        
        }
        else{
        this.evn=evn.concat(def);
        }
        
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
