package QUESTION3;

import java.util.Scanner;

public class KhizarEventPriceWithMethods {
    public static int nog(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter No of guests: ");
    int ps = inp.nextInt();
    return ps;
    }
    public static void moto(){
        System.out.println("*"+"Khizar's makes the food that makes it a party"+"*");
    }
    
    public static void data(int a){
        Scanner in=new Scanner(System.in);
    boolean ev;
    int tp;
    tp=35*a;
    System.out.println("Total price for event is "+tp+"$ for "+a+" guests.");
    if (a>49)
    {
        ev=true;
        System.out.println("Large event : "+ev);
    }
    else{
        ev=false;
        System.out.println("Large event : "+ev);
    }
    
    }
    public static void main(String[] args) {
        int no_of_guests=nog();
        moto();
        data(no_of_guests);
    }    
    
}
