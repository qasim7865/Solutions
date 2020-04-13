package QUESTION3;
import java.util.Scanner;

public class EventDemo {
    public static String evn(){
       System.out.println("Enter Event Number: ");
       Scanner inp=new Scanner(System.in);
       String en=inp.nextLine();
       return en;
    }
    public static int nog(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter No of guests: ");
    int ps = inp.nextInt();
    return ps;
    }
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
         Event obj= new Event();
         String evtno=evn();
         int ng=nog();
         obj.setEvn(evtno);
         obj.setNog(ng);
         KhizarEventPriceWithMethods.moto();
         data(obj.getNog(),obj.getEvn());
     }
     }