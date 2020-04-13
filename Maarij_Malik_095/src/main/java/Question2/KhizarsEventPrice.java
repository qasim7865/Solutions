/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;
import Question1.KhizarsMotto2;
import java.util.Scanner;

/**
 *
 * @author Maarij Malik
 */

public class KhizarsEventPrice {
    public static void main(String[] Args)
    {
        int noOfGuests = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        noOfGuests = input.nextInt();
        input = null;
        KhizarsMotto2.main(null);
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
}