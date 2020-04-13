package QUESTION2;

import java.util.Scanner;

public class KhizarsEventPrice {
     public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    boolean ev;
    
    System.out.println("Enter No of guests: ");
    int ps=in.nextInt();
    int tp;
    tp=35*ps;
    
    System.out.println("*"+"Khizar's makes the food that makes it a party"+"*");
    System.out.println("Number of guests: "+ps);
    System.out.println("Price per guest: 35$");
    System.out.println("Total price for event is "+tp+"$ for "+ps+" guests.");
    if (ps>50)
    {
        ev=true;
        System.out.println("Large event: "+ev);
    }
    else{
        ev=false;
        System.out.println("Large event: "+ev);
    } 
}
}
