/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class khizarseventprice { 
   
    public static void main(String[] args) {
    int guest;
    int totalPrice;
    int perPrice=35;
    System.out.println(" enter no of guest=");
    Scanner input= new Scanner(System.in);
    guest=input.nextInt();
        System.out.println("no of guest = "+guest);
        System.out.println("price per guest"+perPrice+"$");
        totalPrice=guest*perPrice;
        System.out.println("totalPrice"+totalPrice);
        if(guest>50){
            System.out.println("event is large");
        }
        else{
            System.out.println("event is small");
        }
   }
    
    
}
