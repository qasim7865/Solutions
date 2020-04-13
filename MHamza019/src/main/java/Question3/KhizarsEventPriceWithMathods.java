/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author M.Hamza
 */
public class KhizarsEventPriceWithMathods {
      public static int noofGuests(int i){
        System.out.println("Number of guests are  " +i);
        return i;
    }
    public static void eventNo(String b){
        System.out.println("no of event is "+b);
    }
    public static void eventDetails(){
        Scanner input=new Scanner(System.in);
        boolean c;
        int a;
        int b;
        System.out.println("Enter the number of guests");
        a=input.nextInt();
        b=a*35;
        System.out.println("Number of guests are  " +a);
        System.out.println("Price per guest is $35");
        System.out.println("Total price is "+b);
        if (a>=50)
        {
            c=true;
            System.out.println(c);
        }
        else
        {
            c=false;
            System.out.println(c);
        }
    }
    public static void mottowithborder(){
        System.out.println("*****************************************"+"\n"+"*Khizar makes a food that makes it a party*"+"\n"+"*******************************************");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int a;
        String c="31ASD";
        System.out.println("Enter the number of guests");
        a=input.nextInt();
        noofGuests(a);
        eventNo(c);
        mottowithborder();
        eventDetails();
    }
    
}


