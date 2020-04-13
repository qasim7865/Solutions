package Question04;
import java.util.Scanner;
public class EventDemo {
    public final static int  pricePerGuest = 35; 
    public final static int cutOfValue = 50;
    private String eventNo;
    private  int noOfGuest;
    private int price;
    
    public void setEventNo(String eventNo) {
        this.eventNo = eventNo;
    }

    public void setNoOfGuest(int noOfGuest) {
        int y = noOfGuest * pricePerGuest;
        this.noOfGuest = y;
    }

    public  String getEventNo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Event No : ");
        String No= input.nextLine();
        return No;
    }

    public  int getNoOfGuest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of Guests : ");
        
        int No=input.nextInt();
        return No;
    }

    
    public int getPrice() {
        return price;
    }
    
    public EventDemo(String eventNo, int noOfGuest) {
        setEventNo(eventNo);
        setNoOfGuest(noOfGuest);
    }
    EventDemo(){
        this("A000", 0);
    }
    
    public static void main(String[] args) {
        EventDemo x = new EventDemo();
        EventDemo v = new EventDemo();
       
       System.out.println("\t\tDefault Values\n");
       System.out.println("Event No : "+x.eventNo);
       System.out.println("No Of Guests : "+x.noOfGuest);
       System.out.println("\n\t\tDisplaying Data\n");
       System.out.println("\nEvent No : "+ v.getEventNo());
        int w =v.getNoOfGuest();
        System.out.println("No of Guests in Event : " + w);
        System.out.println("Event Price : "+w*pricePerGuest);
       
       
    }
}