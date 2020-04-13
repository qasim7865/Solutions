package Question_5;
//* @Wajaht Masood
import java.util.Scanner;
public class event_demo {
int NO_OF_PEOPLE;
String EVENT_NUMBER;
static int cut_off_value = 50;
int price_per_guest ;
int lower_price_per_guest = 32;
int Highest_price_per_guest = 35;
 //____________________________________________________________________________________wajahat_003_assign
 // THIS IS CONSTRUCTOR of Event_demo_class
 public event_demo(int NO_OF_PEOPLE, String EVENT_NUMBER) {
        this.NO_OF_PEOPLE = NO_OF_PEOPLE;
        this.EVENT_NUMBER = EVENT_NUMBER;
    }
 // THIS IS CONSTRUCTOR
 //____________________________________________________________________________________wajahat_003_assign
 // DISPLAY  METHOD FOR THE  OBJECTS    
    public void display(){
     System.out.println("_____________________valuues of__[th]__constuctor_________________________");
     System.out.println("No_of_people = "+NO_OF_PEOPLE);
     System.out.println("EVENT_NUBMBER = "+EVENT_NUMBER);}
 // DISPLAY  METHOD FOR THE  OBJECTS    
 //____________________________________________________________________________________wajahat_003_assign
   
    // _____-this show default value_____
    public static void Method1_ret()            {
    event_demo obj = new event_demo(98,"a001");
        System.out.print("Default value e.g = "+obj.EVENT_NUMBER);
        System.out.println("\tDefault value e.g = "+obj.NO_OF_PEOPLE);   }
    // _____-this show default value_____
 
//____________________________________________________________________________________wajahat_003_assign
        public static void Is_large(int NO_OF_PEOPLE, String EVENT_NUMBER){
    
        System.out.println("Event  Number= " + EVENT_NUMBER);
        System.out.println("EVENT_NO_OF_PEOPLE "+NO_OF_PEOPLE);
        if (NO_OF_PEOPLE>50){
         boolean y= true;
            System.out.println("Event is large"+ y);}
            else {
            boolean y= false;
            System.out.println("Event is large"+ y);}}
    
// this is for price_per_guests?>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public  int prIce_Per_GUeSt(int NO_OF_PEOPLE){
    if (NO_OF_PEOPLE>50){
    price_per_guest=lower_price_per_guest;
    System.out.println("PER_PERSON_PRICE = "+lower_price_per_guest);
    int  total_price = price_per_guest* NO_OF_PEOPLE;
     return total_price;
    }
    else
    {price_per_guest=Highest_price_per_guest;
   int  total_price = price_per_guest* NO_OF_PEOPLE;
    System.out.println("PER_PERSON_PRICE = "+Highest_price_per_guest);
     return total_price;}
    }
  void DualEvent_CHECK(int No_of_guets){
      int s  = No_of_guets;
         System.out.println("No_of_people = "+ s);
       }
public static void main(String[] args) {
System.out.println("\"____________________Khizer make food that make the party____________________________\"");
         System.out.println("***************************************************************************************");

       // calling default constructor_________wajahat_003_assign
        Method1_ret();
        // calling default constructor_________wajahat_003_assign
        Scanner input = new Scanner(System.in);
        System.out.print("Enter_NO_OF_PEOPLE FOR 1ST CONSTRUCTOR + Enter_EVENT_NUMBER FOR 1ST CONSTRUCTOR like(1 MOO0) = ");
        int a = input.nextInt();
        String b = input.nextLine();
        event_demo obj1= new event_demo(a,b);
        obj1.display();
        int t = obj1.prIce_Per_GUeSt(a);
        System.out.println("Total_price = " +t);
        obj1.DualEvent_CHECK(a);
        
        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("Enter_NO_OF_PEOPLE FOR 2ND CONSTRUCTOR + Enter_NO_OF_PEOPLE FOR 2ND CONSTRUCTOR like(1 MOO0)= ");
        System.out.println("_____________________________________________________________________________________________________");

        int c = input.nextInt();
        
        String d = input.nextLine();
        event_demo obj2= new event_demo(c,d);
        obj2.display();
        int q = obj1.prIce_Per_GUeSt(c);
        System.out.println("Total_price = " +q);
        obj2.DualEvent_CHECK(c);

        System.out.println("_____________________________________________________________________________________________________");
        System.out.println("Enter_NO_OF_PEOPLE FOR 3RD CONSTRUCTOR + Enter_EVENT_NUMBER FOR 3RD CONSTRUCTOR like(1 MOO0) ");
        System.out.println("_____________________________________________________________________________________________________");

        int p = input.nextInt();
        String l = input.nextLine();
        event_demo obj3= new event_demo(p,l);
        obj3.display();
        int z =obj1.prIce_Per_GUeSt(p);
        System.out.println("Total_price =" + z);
        obj3.DualEvent_CHECK(p);
  System.out.println("________________________________________________________\n_______________________________________________");
          
        if (obj1.NO_OF_PEOPLE== obj2.NO_OF_PEOPLE && obj1.NO_OF_PEOPLE== obj3.NO_OF_PEOPLE){
            System.out.println("Both Event is Equal");}
        else if (obj1.NO_OF_PEOPLE > obj2.NO_OF_PEOPLE && obj1.NO_OF_PEOPLE > obj3.NO_OF_PEOPLE ){
            System.out.println("Event of obj1 is large");}
        else if (obj2.NO_OF_PEOPLE > obj1.NO_OF_PEOPLE && obj2.NO_OF_PEOPLE > obj3.NO_OF_PEOPLE){
            System.out.println("Event of obj2 is large");}
        else if (obj3.NO_OF_PEOPLE > obj1.NO_OF_PEOPLE && obj3.NO_OF_PEOPLE > obj2.NO_OF_PEOPLE){
            System.out.println("Event of obj3 is large");}
        else {}
}}
