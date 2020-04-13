/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author M.Hamza
 */
public class Event {
    public String getPhoneNumber() {
        return phoneNumber;
    }
    String phoneNumber;
    public void eventNumber(char a,int b,int c,int d){
        System.out.println("Your Event number is");
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.print(d);
        System.out.println("");
    }
    public void phoneNumber(){
        Scanner input=new Scanner(System.in);
        String a;
        System.out.println("please enter your phone number");
        a=input.nextLine();
        System.out.println("Phone number is "+a.replaceAll("[^0-9]",""));
        if (a.length()<14 || a.length()>14)
        {
            a="0000000000";
            System.out.println("number of digits in a number are less or more than ten then your phone number is");
            System.out.println(a);
        }
    }
     
        public static void mottowithBorder(){
System.out.println("*****************************************"+"\n"+"*Khizar makes a food that makes it a party*"+"\n"+"*******************************************");
     }

    /**
     *
     * @param a
     */
    public static void eventData(int a){
        boolean c;
        int b;
        b=a*35;
        System.out.println("Number of guests are  " +a);
        System.out.println("Price per guest is $35");
        System.out.println("Total price is "+b);
        if (a>=50)
        {
            c=true;
            System.out.println("large event "+c);
        }
        else
        {
            c=false;
            System.out.println("not a large event "+c);
        }
     }
   


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Event i=new Event();
        Scanner input=new Scanner(System.in);
        int e;
        System.out.println("enter the number of guests");
        e=input.nextInt();        
        char a;
        int b,c,d;
        System.out.println("Enter your event's number's first character ");
        a=input.next().charAt(0);
        System.out.println("Enter your event's number's second number ");
        b=input.nextInt();
        System.out.println("Enter your event's number's third number ");
        c=input.nextInt();
        System.out.println("Enter your event's number's last number ");
        d=input.nextInt();
        i.eventNumber(a,b,c,d);
        i.phoneNumber();
        i.mottowithBorder();
        i.eventData(e);
    }
    
}
