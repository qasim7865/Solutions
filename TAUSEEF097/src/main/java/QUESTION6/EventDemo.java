package QUESTION6;
import QUESTION5.Event;
import java.util.Scanner;

public class EventDemo{   
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
boolean x,y,z;
int p;
System.out.println("*** FIRST OBJECT ***");

System.out.println("Enter 1st Event Number: ");
String eventno1=inp.nextLine();
do{
System.out.println("Enter Number Of Guests Between 5-100: ");
int nogst1=inp.nextInt();
if (nogst1>=5 && nogst1<=100)
{
    p=nogst1;
Event objA=new Event(eventno1,nogst1);
objA.setEvn(eventno1);
objA.setNog(nogst1);
System.out.println("********");
display(objA.getNog(),objA.getEvn());
System.out.println("********** Message for guests **********");
for(int lp=0;lp<p;lp++){
    System.out.println("Please come to my event!");
}
x=false;
}
else{
            System.out.println("Wrong Number Of Guests Entered!");
x=true;
}
}while(true==x);

System.out.println("*** SECOND OBJECT ***");

System.out.println("Enter 2nd Event Number: ");
String eventno2=inp1.nextLine();
do{
    System.out.println("Enter Number Of Guests Between 5-100: ");
int nogst2=inp.nextInt();
if (nogst2>=5 && nogst2<=100)
{
Event objB=new Event(eventno2,nogst2);
objB.setEvn(eventno2);
objB.setNog(nogst2);
System.out.println("********");
display(objB.getNog(),objB.getEvn());        
y=false;
}
else{
            System.out.println("Wrong Number Of Guests Entered!");
y=true;
}
}while(true==y);

System.out.println("*** THIRD OBJECT ***");

System.out.println("Enter 3rd Event Number: ");
String eventno3=inp2.nextLine();
do{
    System.out.println("Enter Number Of Guests Between 5-100: ");
int nogst3=inp.nextInt();
if (nogst3>=5 && nogst3<=100)
{
Event objC=new Event(eventno3,nogst3);
objC.setEvn(eventno3);
objC.setNog(nogst3);
System.out.println("********");
display(objC.getNog(),objC.getEvn());        
z=false;
}
else{
            System.out.println("Wrong Number Of Guests Entered!");
z=true;
}
}while(true==z);

     }
}