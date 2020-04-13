/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;
import java.util.Scanner;

public class KhizarsMotto {
    String food ;
public void khizarsMotto() {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Wich Food you want from Khizar ?");
    food = input.next();
}
public void displayMotto() {
    System.out.println("******Food ****** : "+food);
}
    
}
