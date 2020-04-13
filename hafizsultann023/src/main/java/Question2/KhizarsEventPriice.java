/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author hafizabdulmalik
 */
public class KhizarsEventPriice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        boolean e;
        int a;
        int b;
        System.out.println("Enter the no of guests:");
        a=s.nextInt();
        b=a*35;
        System.out.println("No of guests are : " +a);
        System.out.println("Price per head of guest is $35:");
        System.out.println("Total price is :"+b);
        if (a>=50)
        {
            e=true;
            System.out.println(e);
                    }
        else
        {
            e=false;
            System.out.println(e);
        }
    }
    
}
