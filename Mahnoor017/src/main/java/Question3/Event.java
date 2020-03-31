package Question3;

public class Event {
    public static final int pricePerGuest=35,
              cutOffValue=50;
    private String eventNumber;
    private int numOfGuests,
                price;
    public void setEventNumber(String eventNumber) {
        this.eventNumber = eventNumber;
    } 
    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }
    public String getEventNumber() {
        return eventNumber;
    }
    public int getNumOfGuests() {
        return numOfGuests;
    }
    public int getPrice() {
        return price;
    }
    public static void main(String[]args){
        
    }
}
