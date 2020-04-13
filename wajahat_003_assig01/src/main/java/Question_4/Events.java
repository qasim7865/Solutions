
package Question_4;

import java.util.Scanner;

public class Events {
    static  int perpice=35;
         static final  int  CUT_OFF=50;
         private String Event_Nunber;
  private int EVENT_Menmber ;
    private  int EVENT_Price;
//Constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    public Events(String Event_Nunber, int EVENT_Menmber) {
        this.Event_Nunber = Event_Nunber;
        this.EVENT_Menmber = EVENT_Menmber;}
//Constructor>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public int getEVENT_Menmber() {
//_______________________________________________________________________________//
        return EVENT_Menmber;
       
    }
    public void setEVENT_Menmber(int EVENT_Menmber) {
      
        this.EVENT_Menmber = EVENT_Menmber;
    }
    public String getEvent_Nunber() {
        return Event_Nunber;
    }
    public void setEvent_Nunber(String Event_Nunber) {
    this.Event_Nunber=Event_Nunber;
    }
    public void setEVENT_Price(int EVENT_Price) {
        this.EVENT_Price = EVENT_Price;         }
    
    public int getEVENT_Price() {
             return  (EVENT_Price);   }
  
public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("|Khizer's makes the food that makes it a Party|\"");
           System.out.println("*************************************************");
  // w and u ___________w is for Event member 
  // U is for Event_number
        Scanner input = new Scanner(System.in);
       
        System.out.print("ENTER EVENT NUMBER :");
        String u = input.nextLine();
        System.out.print("ENTER EVENT MEMBER :");
        int w = input.nextInt();
         //Event Obj>>>>>>>>>>>>>>>>>>>>>>>>
        Events e1=new Events(u,w);
        //Event Obj>>>>>>>>>>>>>>>>>>>>>>>>
        
// calling seetter/getter 1 (for evnt numb)

System.out.println("______________________________________________");
System.out.println("______________________________________________");
e1.setEvent_Nunber(u);
 String wing =  e1.getEvent_Nunber();
System.out.println("YOUR EVENT |_| Number = "+wing);
          
          
// calling setter/getter 2   (for Event member)  ___________________wajahat_003_assign

       e1.setEVENT_Menmber(w);
       int num_ber=e1.getEVENT_Menmber();
        System.out.println("YOUR TOTAL PEROSNS = "+num_ber);
 
// calling setter 3   (for Event price)   _____________________________ wajahat_003_assign
        int Oper_ation = perpice*w;
        e1.setEVENT_Price(Oper_ation);
        int get_ing= e1.getEVENT_Price();
        System.out.println("EVENT PRICE PER PERSON PRICE "+perpice+ "$");
   System.out.println("EVENT PRICE = " + get_ing+"$");
        
        if (w>50){
            boolean y = true;
                System.out.println("EVENT IS LARGE = "+y);}
            else 
            {
             boolean y = false;
                System.out.println("EVENT IS LARGE = "+y);   }}}
