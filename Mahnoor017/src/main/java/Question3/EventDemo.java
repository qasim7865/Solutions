package Question3;

import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        numOfGuests();
        getEventNumber();
    }
    public static int numOfGuests(){
        int guests;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter number of guests>>");
        guests=keyboard.nextInt();
        return guests;
    }
    public EventDemo() {
    }
    public static String getEventNumber(){
        String eventNumber;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter event number>>");
        eventNumber=keyboard.nextLine();
        return eventNumber;
    }
}
