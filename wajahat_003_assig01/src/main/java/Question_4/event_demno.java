
package Question_4;
//* @Wajaht mASOOD:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

import java.util.Scanner;

public class event_demno{

int NO_OF_PEOPLE;
String EVENT_NUMBER;

    public event_demno(int NO_OF_PEOPLE, String EVENT_NUMBER) {
        this.NO_OF_PEOPLE = NO_OF_PEOPLE;
        this.EVENT_NUMBER = EVENT_NUMBER;
    }
    public static void Method1_ret()            {
    event_demno obj = new event_demno(98,"A000");
        System.out.println("Event-Number like = "+obj.EVENT_NUMBER);
        System.out.println("Event-No-of-Paper-Like = "+obj.NO_OF_PEOPLE);   }
    
    public static void Event_detail(int NO_OF_PEOPLE, String EVENT_NUMBER){
    
        System.out.println("Event  Number= " + EVENT_NUMBER);
        System.out.println("EVENT_NO_OF_PEOPLE "+NO_OF_PEOPLE);
    
    }

    public static void main(String[] args) {
        System.out.println("****************************************");
        System.out.println("\"Khizer make food that make the party\"");
         System.out.println("***************************************");
        Scanner input = new Scanner(System.in);
        Method1_ret();
         System.out.print("Enter_Event_Number = ");

        String s = input.nextLine();
         System.out.print("Enter_Event_Member = ");
         int p = input.nextInt();
        Event_detail(p,s);
 }}
