/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author Laptop
 */
public class BadshahsRentalPrice {
    public int inputMinutes(){
                Scanner input=new Scanner(System.in);
                int a=input.nextInt();
                return a;
                
    }
    public void getDetail(int minutes){
        int mins=0;
        int hours=0;
        int cost;
        if(minutes<=60){
            mins=minutes;
        }
        else{
            mins=minutes%60;
            hours=minutes/60;
        }
        if(minutes<=60){
            cost=40;
        }
        else{
            cost=(hours*40)+mins;
        }
       
        System.out.println("Hours: "+hours);
        System.out.println("minutes: "+mins);
        System.out.println("total cost: "+cost);
    }
    
}
