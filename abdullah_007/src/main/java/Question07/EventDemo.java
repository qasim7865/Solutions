package Question07;
import java.util.Scanner;
public class EventDemo {
    public static int  pricePerGuest; 
    public final static int cutOfValue = 50;
    private  static String eventNo;
    private static int noOfGuest;
    private static int price;
    public final static int  lowerPricePerGuest = 32; 
    public final static int  upperPricePerGuest = 35; 

    public EventDemo(int noOfGuest, String eventNo) {
        this.eventNo = eventNo;
        this.noOfGuest = noOfGuest;
    }

    
    
    public static void checkMethod()            {
        EventDemo obj = new EventDemo(007,"Mi7");
        System.out.print("Default value is = "+ obj.eventNo);
        System.out.println("Default value is = "+ obj.noOfGuest); 
    }
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }
    public static void setNoOfGuests(int noOfGuest){
        //this.noOfGuest=noOfGuest;
        if(isLargeEvent(noOfGuest)){
            pricePerGuest = lowerPricePerGuest; 
        }
        else{
            pricePerGuest = upperPricePerGuest;
        }
        price = noOfGuest*pricePerGuest;
        }

    public static String getEventNo() {
        return eventNo;
    }

    public static int getNoOfGuest() {
        return noOfGuest;
    }
    public static int getPrice() {
        return price;
    }
    
    public int pricePerGuest(){
        return 35;
    }
    private static boolean isLargeEvent(int d){
        if (d >50){
            return true;
        }
        else{
          return false;  
        }
    }
    
    public static double inclusiveDataPrice(int k){
        int pr = k* 35;
        if(pr<=5 || pr>=100){
            System.out.println("PLZ Entre No of Guest (Last No Exeeds) : ");
            Scanner input = new Scanner(System.in);
            int j = input.nextInt();
            EventDemo.inclusiveDataPrice(j);
            
        }
        else{
            
            System.out.println("Price is Between 5 & 100");
        }
        return pr;
    }
            
        
    public void displayMethod(){
        System.out.println("\n\n\t\tDisplaying Data with Each Object");
        System.out.println("Event No : "+ EventDemo.getEventNo());
        System.out.println("No of Guests in Event : " + EventDemo.getNoOfGuest());
        //System.out.println("Event Price : "+ price);
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Event Number For Obj 1 : ");
        String w = input.nextLine();
        System.out.print("Enter Number of guests For Obj 1 : ");
        int e= input.nextInt();
        EventDemo.setNoOfGuests(e);
         EventDemo x = new EventDemo(e,w);      
        x.displayMethod();
        System.out.print("\nEnter Phone Number For Obj 1 ( You Can Write in String Form Also ) : ");
        String ph = input.nextLine();
        System.out.print("\n");
        StringBuffer phNo = Question06.Event.phoneNumberConversion(ph);
        System.out.println("Phone No of Customer is :  "+phNo);
        
        System.out.println("**************************************************************\n");
        System.out.print("Enter Event Number For Obj 2 : ");
        String t = input.next();
        System.out.print("Enter Number of guests For Obj 2 : ");
        int y = input.nextInt();
        EventDemo.setNoOfGuests(y);
        EventDemo v = new EventDemo(y,t);
        System.out.print("\nEnter Phone Number For Obj 2 ( You Can Write in String Form Also ) : ");
        String xs = input.nextLine();
        System.out.print("\n");
        StringBuffer phone = Question06.Event.phoneNumberConversion(xs);
        v.displayMethod();
        System.out.println("\nPhone No of Customer is :  "+phone);
        System.out.println("**************************************************************\n");
        System.out.print("Enter Event Number For Obj 3 : ");
        String u = input.next();
        System.out.print("Enter Number of guests For Obj 3 : ");
        int o = input.nextInt();
        EventDemo.setNoOfGuests(o);
        EventDemo a = new EventDemo(o,u);
        System.out.print("\nEnter Phone Number For Obj 3 ( You Can Write in String Form Also ) : ");
        String fg = input.nextLine();
        System.out.print("\n");
        StringBuffer cellNo = Question06.Event.phoneNumberConversion(fg);
        a.displayMethod();
        System.out.println("Phone No of Customer is :  "+cellNo);
        for(int h=0;h<o;h++){
            System.out.println("Please Come to my Event !");
        }
      
    }
}
