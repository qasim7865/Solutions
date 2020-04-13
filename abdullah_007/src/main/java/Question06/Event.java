package Question06;
import java.util.Scanner;
import static java.lang.Character.isUpperCase;
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
    public static String setEventNumber(){
        int z=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Event Number such as \"A000\" = ");
        String f = input.nextLine();
        int u=f.length();
        char k=f.charAt(0);
        boolean d = isUpperCase(k);
        
        if(u==4 && d==true){
            z=1;
            String Event_number = f;
            return Event_number;
        }
        else{
        z=0;
        }
        
        return null;
    }
    
    //@Abdullah Rauf ---->  These are New Things used in Program
    
    //Java StringBuffer class is used to create mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
    
    //The java string charAt() method returns a char value at the given index number.
    
    public static StringBuffer phoneNumberConversion(String No){
        StringBuffer  phNoObject  =   new StringBuffer(No);
        for (int j=0 ; j<phNoObject.length();j++){
            if(phNoObject.charAt(j)<48 || phNoObject.charAt(j)>57){
                phNoObject.deleteCharAt(j);
            }
        }
        return phNoObject;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x= setEventNumber();
        System.out.print("Event Number After Conversion is : "+ x);
        
        System.out.print("\nPlz Enter Phone Number sch as (920) 872-9182 : ");
        String ph = input.nextLine();
        StringBuffer phNo = Event.phoneNumberConversion(ph);
        if(ph.length() > 12){
            System.out.println("Your Entered Phone No After Conversion is :  0000000000 ");
        }
        else{
            System.out.println("Your Entered Phone No After Conversion is :   " +phNo);
        }
    }
    
   
}
