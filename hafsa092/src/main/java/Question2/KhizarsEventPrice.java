/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import java.util.Scanner;
public class KhizarsEventPrice {
    int guest;
    Scanner input = new Scanner(System.in);
    final int priceEachGuest = 35;
    int total;
    boolean large=false;
    void guestTotal() {
        KhizarMotto obj = new KhizarMotto();
        obj.displayMotto();
        System.out.println("Enter Total Guest attending an Event XD :");
        guest = input.nextByte();
        System.out.println("Price Each Guest : "+priceEachGuest);
        System.out.println("No of  Guest : "+guest);
        total = guest*priceEachGuest;
        System.out.println("Total Price : "+(total));
        if(guest>=50)
            large = true;    
        if(large)
            System.out.println("It is a Large Party XD :");
        else
            System.out.println("It is not a Large Party XD :");
        
    }
    
}
