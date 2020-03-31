package Question5;

public class Event {
    private int price;
    private static int pricePerGuest;
    private static int numOfGuests;
    int lowerPricePerGuest=32,
        highestPricePerGuest=35;
    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }
    public int getNumOfGuests() {
        return numOfGuests;
    }
    public static int pricePerGuest(){
        return pricePerGuest=35;
    }
    public static boolean isLargeEvent(int guests){
        boolean a;
        if(guests>=50){
            a=true;
        }
        else{
            a=false;
        }
        return a;
    }
    public static void main(String[] args) {
        
        System.out.println(pricePerGuest());
        System.out.println("Event is large? ");
        System.out.println(isLargeEvent(numOfGuests));
    }
}
