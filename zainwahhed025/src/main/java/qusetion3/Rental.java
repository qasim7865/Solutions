/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qusetion3;

import java.util.Scanner;
import question2.BadshahsMotto2;

/**
 *
 * @author Zain Waheed
 */
public class Rental {
    public static int a;
    public int input(){
        
        
        System.out.println("enter no of minutes");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        return a;
    }
    public void motto(){
        System.out.println("**********************************************************************");
        System.out.println("Badshah’s makes it fun in the sun.");
        System.out.println("**********************************************************************");
    }
    public void disp(){
        int hours, minutes, z, additional, rentalCost;
        minutes=a;
        hours=minutes/60;
        z=hours*60;
        additional=minutes-z;
        rentalCost=hours*40+additional;
        
        System.out.println("Hours"+hours);
        System.out.println("Minutes"+additional);
        
        
        System.out.println("Rental Cost="+rentalCost);
    }
}
