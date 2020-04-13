/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.Scanner;

/**
 *
 * @author Shahzaib
 */
public class EventDemo {
           public static  int Method2(){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number of peoples in Event ");
    int y=input.nextInt();
    return y;
    } 
    public static  void Method2(String u){
            String item = null;
        System.out.println(item);}
     public static  void Method2(int No){
         int Price = 35;
        System.out.println("Price per person"+" "+Price+"$");
        int NetPrice=(Price*No);
        System.out.println("Total price is =" + NetPrice+"$");
   
            
     } 
      public static void main(String[] args) {
       Method2("Khizer's makes the food that makes it a Party");

       int VALUEZ= Method2();
        Method2(VALUEZ);
    }   
}
