/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4;

/**
 *
 * @author Laptop
 */

    public class BadshahsRentalPrice {
    public static void getDetail(int minutes,String ContractNumber){
        int mins;
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
       
        System.out.println("Contract Number: "+ContractNumber);
        System.out.println("Hours: "+hours);
        System.out.println("minutes: "+mins);
        System.out.println("total cost: "+cost);
    }
    
}
