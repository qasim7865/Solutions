/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Scanner;

/**
 *
 * @author Talha
 */

    public class KhizarsEventPrice {
    public static int getGuests(){
       
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        return a;
    }
       public static String getEventNumber(){
        Scanner input=new Scanner(System.in);
        String a=input.nextLine();
        return a;
    }

    public static void CalculateRent(int guests,String EventNumber){
        
        
        
        
        System.out.println("Event Number:"+EventNumber);
        System.out.println("number of guests: "+guests);
        System.out.println("price per guest: "+35+"dollars");
        
        if(guests>=50){
            System.out.println("large event");
        }
        else{
            System.out.println("Small Event");
        }
    }
    
}
