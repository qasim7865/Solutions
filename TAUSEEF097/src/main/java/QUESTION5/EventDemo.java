package QUESTION5;
import java.util.Scanner;

public class EventDemo {   
        public static void display(int a,String e){
        Scanner in=new Scanner(System.in);
    boolean ev;
    int tp;
        System.out.println("Event # "+e);
        System.out.println("Number of guestes: "+a);
        System.out.println("Price per guest: 35$(Guests less than 50) / 32$(Guests more the 50)");
    if(Event.isLargeEvent(a)==true)
    {   
        tp=Event.lppg*a;
         System.out.println("Total price for event is "+tp+"$ for "+a+" guests.");
         System.out.println("Event is large!");

    }
    else
    {
        tp=Event.hppg*a;
         System.out.println("Total price for event is "+tp+"$ for "+a+" guests.");
         System.out.println("Event is small!");
    } 
        }
     public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
         Scanner inp1=new Scanner(System.in);
         Scanner inp2=new Scanner(System.in);

System.out.println("*** FIRST ***");
System.out.println("Enter 1st Event Number: ");
String eventno1=inp.nextLine();
System.out.println("Enter Number Of Guestes: ");
int nogst1=inp.nextInt();
Event objA=new Event(eventno1,nogst1);
objA.setEvn(eventno1);
objA.setNog(nogst1);
System.out.println("*** SECOND ***");

System.out.println("Enter 2nd Event Number: ");
String eventno2=inp1.nextLine();
System.out.println("Enter Number Of Guestes: ");
int nogst2=inp.nextInt();
Event objB=new Event(eventno2,nogst2);
objB.setEvn(eventno2);
objB.setNog(nogst2);

System.out.println("*** THIRD ***");
System.out.println("Enter 3rd Event Number: ");
String eventno3=inp2.nextLine();
System.out.println("Enter Number Of Guestes: ");
int nogst3=inp.nextInt();
Event objC=new Event(eventno3,nogst3);
objC.setEvn(eventno3);
objC.setNog(nogst3);
System.out.println("********");
display(objA.getNog(),objA.getEvn());
System.out.println("********");
display(objB.getNog(),objB.getEvn());
System.out.println("********");
display(objC.getNog(),objC.getEvn());
/* Question 5 part (b) last part from here*/
compare(nogst1,nogst2);

compare(nogst2,nogst3);

compare(nogst3,nogst1);
          
     }
         public static void compare(int x,int y){
    EventDemo e=new EventDemo();
    if(x==y)
        System.out.println("Both the events are same");
    else if(x>y)
        System.out.println("First Event is larger");
    else
        System.out.println("Second Event is larger");

    }
     }