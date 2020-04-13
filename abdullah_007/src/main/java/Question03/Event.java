
package Question03;
import java.util.Scanner;
public class Event {
    public final static int pricePerGuest=35;
    public final static int cutOff = 50;
    private String eventNo;
    private int noOfGuest;
    private int price;

    public void setEventNo(String eventNo) {
        
        this.eventNo = eventNo;
    }

    public int setNoOfGuest(int noOfGuest) {
        int x = pricePerGuest * noOfGuest;
       
        this.noOfGuest = x;
        return x;
    }

    
    public static String getEventNo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Event No : ");
        String No= input.nextLine();
        return No;
    }

    public static int getNoOfGuest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Guests : ");
        
        int No=input.nextInt();
        return No;
    }
    public static int Price(int g){
        int p;
        p = g*pricePerGuest;
        return p;
    }

    public static void  displayMethod(){
        System.out.println("\nEvent No : "+ Event.getEventNo());
        int y=Event.getNoOfGuest();
        System.out.println("No of Guests in Event : " + y);
        System.out.println("Price : "+ Event.Price(y));
    }
   
    
    public static void main(String[] args) {
        Event.displayMethod();
    }
    
    
}
