/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author Maarij Malik
 */


public class KhizarsEventPriceWithMethods {
public static int guestsInput()
    {
        int noOfGuests = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        noOfGuests = input.nextInt();
        input = null;
        return noOfGuests;
    }
    public static void displayMotto()
    {
        for(int loopVal = 0; loopVal < 50; loopVal++)
        {
            System.out.print("*");
        }
        System.out.println("\n* Khizar’s makes the food that makes it a party. *");
        for(int loopVal = 0; loopVal < 50; loopVal++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
    public static void displayEventDetails(int noOfGuests)
    {
        System.out.println("\nNumber of guests attending the event: " + noOfGuests);
        System.out.println("Catering price per guest: " + 35);
        System.out.println("Total catering price: " + noOfGuests*35);
        if (noOfGuests >=50)
        {
            System.out.println("The job is a large event.");
        }
        else
        {
            System.out.println("The job is not a large event.");
        }
    }
    public static String eventNumberInput()
    {
        String eNumber;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an event number: ");
        eNumber = input.nextLine();
        return eNumber;
    }
    public static void main(String[] Args)
    {
        int noOfGuests = guestsInput();
        displayMotto();
        displayEventDetails(noOfGuests);
    }
}

 