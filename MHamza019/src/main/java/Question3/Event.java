package Question3;
/**
 *
 * @author M.Hamza
 */
import java.util.Scanner;
public class Event{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        noofGuests();
        mottowithBorder();
        int b;
        b=input.nextInt();
        eventData(b);
    }
     public static int noofGuests(){
         int i;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of guests");
        i=input.nextInt();
        System.out.println("Number of guests are  " +i);
        return i;
    }
        public static void mottowithBorder(){
System.out.println("*****************************************"+"\n"+"*Khizar makes a food that makes it a party*"+"\n"+"*******************************************");
     }

    /**
     *
     * @param a
     */
    public static void eventData(int a){
        boolean c;
        int b;
        System.out.println("Enter the number of guests");
        b=a*35;
        System.out.println("Number of guests are  " +a);
        System.out.println("Price per guest is $35");
        System.out.println("Total price is "+b);
        if (a>=50)
        {
            c=true;
            System.out.println("large event "+c);
        }
        else
        {
            c=false;
            System.out.println("not a large event "+c);
        }
     }

}