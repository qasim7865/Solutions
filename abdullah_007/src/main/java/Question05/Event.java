package Question05;
import java.util.Scanner;

public class Event {
    public final static int  lowerPricePerGuest = 32; 
    public final static int  upperPricePerGuest = 35; 
    public final static int cutOfValue = 50;
    private String eventNo;
    private  int noOfGuest;
    private int price;
    int pricePerGuest;

    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }
    public void setNoOfGuests(int noOfGuest){
        this.noOfGuest=noOfGuest;
        if(isLargeEvent(noOfGuest)){
            pricePerGuest = lowerPricePerGuest; 
        }
        else{
            pricePerGuest = upperPricePerGuest;
        }
        price = noOfGuest*pricePerGuest;
        }

    public String getEventNo() {
        return eventNo;
    }

    public int getNoOfGuest() {
        return noOfGuest;
    }
    public int getPrice() {
        return price;
    }
    
    public int pricePerGuest(){
        return 35;
    }
    private boolean isLargeEvent(int d){
        if (d >50){
            return true;
        }
        else{
          return false;  
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Event events = new Event();
        System.out.print("Enter Event Number: ");
        events.setEventNo(scanner.next());
        System.out.print("Enter Number of guests: ");
        events.setNoOfGuests(scanner.nextInt());
        
        System.out.println("Event number: " + events.getEventNo());
        System.out.println("Number of guests: " + events.getNoOfGuest());
        System.out.println("Event Price: " + events.getPrice());
    }
    
   
}
