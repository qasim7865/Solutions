package Question04;

import java.util.Scanner;

public class Event {
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

    
    public int getPrice() {
        return price;
    }

    public Event(String eventNo, int noOfGuest) {
        setEventNo( eventNo);
        setNoOfGuest(noOfGuest);
    }
    Event(){
        this("A000", 0);
    }
    public static void displayMethod(){
        System.out.println("\nEvent No : "+ Event.getEventNo());
        int x =Event.getNoOfGuest();
        System.out.println("No of Guests in Event : " + x);
        System.out.println("Event Price : "+x*pricePerGuest);
    }
    public static void main(String[] args) {
        displayMethod();
    }
    
   
}
