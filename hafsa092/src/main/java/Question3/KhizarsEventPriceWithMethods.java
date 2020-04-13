/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;
import java.util.Scanner;

public class KhizarsEventPriceWithMethods {
    int guest;
    Scanner input = new Scanner(System.in);
    final int priceEachGuest = 35;
    int total;
    boolean large=false;
    int guestTotal() {
        
        System.out.println("Enter Total Guest attending an Event XD :");
        guest = input.nextByte();
        return guest;
    }
    int total() {
        System.out.println("Total Price : "+(total));
        return total;
    }
    int noOfGuest() {
        System.out.println("No of  Guest : "+guest);
        return guest;
    }
    void Motto () {
        KhizarMotto obj = new KhizarMotto();
        obj.displayMotto();
    }
    boolean eventLarge() {
        System.out.println("Price Each Guest : "+priceEachGuest);
        
        total = guest*priceEachGuest;
        
        if(guest>=50)
            large = true;    
        if(large)
            System.out.println("It is a Large Party XD :");
        else
            System.out.println("It is not a Large Party XD :");
        return large;
        
    }
}
