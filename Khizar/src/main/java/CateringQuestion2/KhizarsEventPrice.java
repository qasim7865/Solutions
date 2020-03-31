/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CateringQuestion2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author princ
 */
public class KhizarsEventPrice {
    private static final int pricePerPerson = 35;
    private static int numberOfGuests;
    private static double price;
    private static boolean eventSize;
    public static void userInput(){
        Scanner keyboard = new Scanner(System.in);
        numberOfGuests = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of guests"));
        if (numberOfGuests >=50){
            eventSize = true;
        } else {
            eventSize = false;
        }
    }
    public static void computeBill(){
        price = numberOfGuests * pricePerPerson;
        System.out.println("The number of guests = " + numberOfGuests);
        System.out.println("The price per guest = " + pricePerPerson);
        System.out.println("The total price is = " + price);
        System.out.println("The event is a large event = " + eventSize);
    }
}
