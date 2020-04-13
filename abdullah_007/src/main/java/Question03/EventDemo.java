package Question03;
public class EventDemo {
   
    public static void displayEventNo(){
        String w;
        int r,t,y;
        w = Event.getEventNo();
        r=Event.getNoOfGuest();
        t=Event.pricePerGuest;
        y=t*r;
        System.out.println("\nEvent No : "+w);
        System.out.println("No of Guest : "+r);
        System.out.println("Price Per Guest : "+t+" $");
        System.out.println("Total Price : "+y+" $");
        
    }
    public static void khizarMotto2(){
        System.out.println("************************************");
        System.out.println("Khizer make food that make the party");
        System.out.println("************************************");
}

    public static void main(String[] args) {
        EventDemo.displayEventNo();
        EventDemo.khizarMotto2();
        
    }
}
