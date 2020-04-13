package Question_7;
//* aurther=====================================================================@Wajaht Masood_003_assign
import static java.lang.Character.isUpperCase;
import java.util.Scanner;
public class event_demo {
int NO_OF_PEOPLE;
String EVENT_NUMBER;
long Phone_no;
public event_demo(int NO_OF_PEOPLE) {
this.NO_OF_PEOPLE = NO_OF_PEOPLE;
}public static void Event_detail(int NO_OF_PEOPLE, String EVENT_NUMBER){
 System.out.println("Event  Number= " + EVENT_NUMBER);
    System.out.println("EVENT_NO_OF_PEOPLE "+NO_OF_PEOPLE);
    }
    // THIS METHOD IS BASCIALLY  FOR THE SETTING EVENT_NUMBER THAT 
        public static String setting_Event_number (){
        int k=0;
        while(k==0){
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE EVENT NUMBER Exact LIKE A000 = ");
        String a = input.nextLine();
        int w=a.length();
        char v=a.charAt(0);
        boolean d = isUpperCase(v);
        if(w==4 && d==true){
            k=1;
            String Event_number = a;
            return Event_number;
        }else{
        k=0;
        }}
        return null;}
        // this is for the convrsion of String data to _________________ simple string 
        //like if you enter any symbol or alphabet than that method delete the the symbol and speciacal char
        static StringBuffer convert(String conv_Number){
        StringBuffer  obj  =   new StringBuffer(conv_Number);
        for (int i=0 ; i<obj.length();i++){
        if(obj.charAt(i)<48 || obj.charAt(i)>57){
          obj.deleteCharAt(i);
          }}
       return obj;
//* aurther=====================================================================@Wajaht Masood_003_assign
} public static void main(String[] args) {
System.out.println("\"____________________Khizer make food that make the party____________________________\"");
System.out.println("***************************************************************************************");
        String u = setting_Event_number();
        System.out.println("___________________________");
        System.out.println("YOUR EVENT NUMBER = " + u +" ✔ ");
        System.out.println("___________________________");
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE PHONE NUMBER like(000)000-000-0= ");
        String Number =input.nextLine();
        StringBuffer p =  convert(Number);
        // if for invalid phone no In case Invalid Phone_no it return Default 00000000
        if((p.length())>10){
        System.out.println("___________________________");
        System.out.println("YOUR PHONE NO = 00000000000"+ " YOU ENTER AN INVALID NUMBER ");
        System.out.println("___________________________");}
        else{
        System.out.println("___________________________");
        System.out.println("Your_number = "+ p +" ✔ ");
        System.out.println("___________________________");}
        // this is from the previous codes just for the complete event details and few modification not needed in questiob
 
        
        /* ---------------------------Important---------------------------------
        this is important sir as i didn't able to dO [6] question so i use previous data set 
        in which there is event details are given and modify it to some extend---------
         */ 
        
        
        if((p.length())<=10){
        System.out.print("PEOPLE NUMBER ON AN EVENT =");
        int NoofPeople = input.nextInt();
        System.out.println("___________________________");
        int PriceperPerson = 35;
        int PriceperPerson2 = 32;
        if(NoofPeople>50){
        System.out.println("PRICE PER MAN "+PriceperPerson2 +"$");
         int TOTAL_PRICE=(PriceperPerson2*NoofPeople);
        System.out.println("TOTAL COST IS =" + TOTAL_PRICE+"$  Only ✔ ");
        }
      
        
        else {        System.out.println("PRICE PER MAN "+PriceperPerson +"$");
         int TOTAL_PRICE=(PriceperPerson*NoofPeople);
        System.out.println("✌ TOTAL COST IS =" + TOTAL_PRICE+"$  Only ✌");}
        
       
        if (NoofPeople>50){
            boolean y=true;
            System.out.println("✿ EVENT IS LARGE"+y + "✿");
}
        else 
        {boolean y=false;
            System.out.println("✿ EVENT IS large "+ y+ "✿");
            System.out.println("___________________________________________");
}}
}}
