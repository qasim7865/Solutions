package Question_5;
//*@Wajaht Masood_003_ASSIGN#01_______________________________________________||

import java.util.Scanner;
public class Event{
int NO_OF_PEOPLE;
String EVENT_NUMBER;
int price_per_guest ;
int lower_price_per_guest = 32;
int Highest_price_per_guest = 35; 
public  int method(int NO_OF_PEOPLE){
   if (NO_OF_PEOPLE>50){
    price_per_guest=lower_price_per_guest;
    System.out.println("PER_PERSON_PRICE = "+lower_price_per_guest);
    int  total_price = price_per_guest* NO_OF_PEOPLE;
     return total_price;
    }else
    {price_per_guest=Highest_price_per_guest;
   int  total_price = price_per_guest* NO_OF_PEOPLE;
    System.out.println("PER_PERSON_PRICE = "+Highest_price_per_guest);
     return total_price;}
}
// method isLarge Declares
void isLargeEvent(){
if (NO_OF_PEOPLE>50){
boolean y= true;
    System.out.println("Event is large"+ y);}
else{
    boolean y= false;
    System.out.println("Event is large"+ y);
}}
// constructor for "Event_Number"
public Event(String EVENT_NUMBER) {
        this.EVENT_NUMBER = EVENT_NUMBER;
System.out.println("_________________________________");
        System.out.println("YOUR EVENT NUMBER = "+EVENT_NUMBER);
        System.out.println("_________________________________");
 }
        public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.print("ENTER YOUR EVENT NUMBER = ");
        Event obj = new Event(input.nextLine());
        System.out.print("ENTER THE EVENT TOTAL PEOPLE = ");
        int value = obj.method(input.nextInt());
        System.out.println("TOTAL PRICE FOR YOUR EVENT = "+value);
        
        
        }

}
 