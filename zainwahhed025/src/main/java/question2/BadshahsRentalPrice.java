/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Zain Waheed
 */
public class BadshahsRentalPrice {
    public static void main(String[]args){
        int hours,minutes,rentalCost,additional,z;
        
        BadshahsMotto2.Moto();
        System.out.println("enter no of minutes");
        Scanner input=new Scanner(System.in);
        minutes=input.nextInt();
         
        
        hours=minutes/60;
        z=hours*60;
        additional=minutes-z;
        rentalCost=hours*40+additional;
        
        System.out.println("Hours"+hours);
        System.out.println("Minutes"+additional);
        
        
        System.out.println("Rental Cost="+rentalCost);
        
       
        
     
    }
}
