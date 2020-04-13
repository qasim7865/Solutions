/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Mishalbukhari
 */
public class KhizarsEventPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of guests");
        int guests = input.nextInt();
        
        int totalPrice = guests * 35;
        boolean largeEvent;
        
        if (guests <50){
            largeEvent = false;
        }else{
            largeEvent = true;
        }
        
        KhizarsMotto2.displayMotto();
        System.out.println("Total number of guests = " + guests);
        System.out.println("Price per guests = " + 35);
        System.out.println("The total price is = "+ totalPrice);
        System.out.println("The event is large = " + largeEvent);
    }
}
