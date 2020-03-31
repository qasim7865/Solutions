/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

import Question1.BadshahsMotto2;
import java.util.Scanner;

/**
 *
 * @author princ
 */
public class BadshahsRentalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the number of minutes equipment is rented.");
        int data = input.nextInt();
        int hours = data / 60;
        int additionalMinutes = data % 60;
        int price = (40 * hours)+additionalMinutes;
        
        BadshahsMotto2 mottoWithBorder = new BadshahsMotto2();
        mottoWithBorder.displayMottoWithBorder();
        System.out.println("Total hours = " + hours);
        System.out.println("Total additional minutes = "+ additionalMinutes);
        System.out.println("Total price = " + price);
    }
}
