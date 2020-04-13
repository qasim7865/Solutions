package QUESTION4;
import java.util.Scanner;

public class EventDemo {       
    public static void data(int a,String e){
        Scanner in=new Scanner(System.in);
    boolean ev;
    int tp;
    tp=35*a;
        System.out.println("Event # "+e);
        System.out.println("Number of guestes: "+a);
        System.out.println("Price per guest: 35$");
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
         Scanner inp=new Scanner(System.in);
Event def=new Event();
System.out.println("***DEFAULT CONSTRUCTOR(Without parameters)***");
data(def.getNog(),def.getEvn());

System.out.println("\n***CONSTRUCTOR(With parameters)***");

System.out.println("\nEnter Event Number: ");
String evtno=inp.nextLine();
System.out.println("Enter Number Of Guests: ");
int ng=inp.nextInt();

Event objA=new Event(evtno,ng);
objA.setEvn(evtno);
objA.setNog(ng);
data(objA.getNog(),objA.getEvn());
     }
     }