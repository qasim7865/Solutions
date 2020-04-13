/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class KhizarsEventPriceWithMethods {
public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        numberofGuests();
        mottowithBorder();
        int a;
        a=s.nextInt();
        eventData(a);
    }
     public static int numberofGuests(){
        int c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of guests:");
        c=s.nextInt();
        System.out.println("No of guests are  :" +c);
        return c;
    }
        public static void mottowithBorder(){
        System.out.println("*******************************************************************"+"\n"+"Khizar makes a food that makes it a party"+"\n"+"*******************************************************************");
     }

       
            public static void eventData(int a){
        boolean e;
        int b;
        System.out.println("Enter the number of guests:");
        b=a*35;
        System.out.println("Number of guests are : " +a);
        System.out.println("Price per guest is $35:");
        System.out.println("Total price is ;"+b);
        if (a>=50)
         {
            e=true;
            System.out.println("large events: "+e);
        }
        else
        {
            e=false;
            System.out.println("not a large event; "+e);
        }
     }
   

}
