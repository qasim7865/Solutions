
package Question_3;

import java.util.Scanner;

public class Event {
         
         static  int perpice=35;
         static final  int  CUT_OFF=50;
         private String Event_Nunber;
         private int EVENT_Menmber ;
         private int EVENT_Price;

    public int getEVENT_Menmber() {
         System.out.println("|Khizer's makes the food that makes it a Party|\"");
           System.out.println("*************************************************");
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER TOTAL MEMBERS");
        int x= input.nextInt();
        return EVENT_Menmber=x;
       
    }
    public void setEVENT_Menmber(int EVENT_Menmber) {
         System.out.println("TOTAL EVENT MEMBER " + EVENT_Menmber);
        this.EVENT_Menmber = EVENT_Menmber;
    }
    public String getEvent_Nunber() {
        return Event_Nunber;
    }
    public String setEvent_Nunber() {
             return "m1000";
   }
    public void setEVENT_Price(int EVENT_Price) {
        this.EVENT_Price = EVENT_Price;         }
    
    public void getEVENT_Price(int EVENT_Price) {
        System.out.println("EVENT PRICE  "+EVENT_Price);
        this.EVENT_Price = EVENT_Price;         }
    public static void main(String[] args) {
        Event e1=new Event();
int x = e1.getEVENT_Menmber();
        e1.setEVENT_Menmber(x);
        e1.getEvent_Nunber();
        System.out.println();
      String name =  e1.setEvent_Nunber();
        System.out.println("EVENT NUMEBR : "+name);
 e1.setEVENT_Price(perpice);
        e1.getEVENT_Price(perpice*x);
        System.out.println("per price = "+perpice+"$");
 }}
