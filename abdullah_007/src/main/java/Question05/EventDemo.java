package Question05;
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
            
        
    public void displayMethod(){
        System.out.println("\n\t\tDisplaying Data with Each Object\n");
        System.out.println("\nEvent No : "+ EventDemo.getEventNo());
        System.out.println("No of Guests in Event : " + EventDemo.getNoOfGuest());
        System.out.println("Event Price : "+ price);
    }
   
    public static void main(String[] args) {
       
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Event Number For Obj 1 : ");
        String w = input.nextLine();
        System.out.print("Enter Number of guests For Obj 1 : ");
        int e= input.nextInt();
        EventDemo.setNoOfGuests(e);
         EventDemo x = new EventDemo(e,w);
         System.out.print("Displaying Data For Obj 1 : ");
        x.displayMethod();
        System.out.println("**************************************************************\n");
        System.out.print("Enter Event Number For Obj 2 : ");
        String t = input.next();
        System.out.print("Enter Number of guests For Obj 2 : ");
        int y = input.nextInt();
        EventDemo.setNoOfGuests(y);
        EventDemo v = new EventDemo(y,t);
        System.out.print("Displaying Data For Obj 2 : ");
        v.displayMethod();
        System.out.println("**************************************************************\n");
        System.out.print("Enter Event Number For Obj 3 : ");
        String u = input.next();
        System.out.print("Enter Number of guests For Obj 3 : ");
        int o = input.nextInt();
        EventDemo.setNoOfGuests(o);
        EventDemo a = new EventDemo(o,u);
        System.out.print("Displaying Data For Obj 3 : ");
        a.displayMethod();
        
       if(x.noOfGuest == v.noOfGuest && x.noOfGuest == a.noOfGuest){
           System.out.println("Both Event is Equal");
       }
       else if (x.noOfGuest > v.noOfGuest && x.noOfGuest > a.noOfGuest ){
            System.out.println("Event of obj1 is large");
            System.out.println("\nNo oF Event NO = "+x.getEventNo());
            System.out.println("\nNo oF Guest = "+x.noOfGuest);
       }
       else if (v.noOfGuest > x.noOfGuest && v.noOfGuest > a.noOfGuest){
            System.out.println("Event of obj2 is large");
            System.out.println("\nNo oF Event NO = "+v.getEventNo());
            System.out.println("\nNo oF Guest = "+v.noOfGuest);
            
       }
       else if (a.noOfGuest > x.noOfGuest && a.noOfGuest > v.noOfGuest){
            System.out.println("Event of obj3 is large");
            System.out.println("\nNo oF Event NO = "+a.getEventNo());
            System.out.println("\nNo oF Guest = "+a.noOfGuest);
       }
       else {
           System.out.println("********** INVALID **********");
       }
       }
    }
