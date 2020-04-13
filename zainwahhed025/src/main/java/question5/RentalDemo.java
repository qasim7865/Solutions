package question5;
public class RentalDemo {
    public static void main(String[] args){
    Rental a=new Rental();
    
        int hc=a.input();
      
        String rt=a.input1();
        Rental uj=new Rental(rt,hc);
        uj.disp();
         
        int mp=a.input();
        
        String lo=a.input1();
        Rental ue=new Rental(lo,mp);
        ue.disp();
           
            
       
        int ng=a.input();
        
            String no=a.input1();
            Rental fg=new Rental(no,ng);
            fg.disp();
           
        
    Rental vq=new Rental();
    Rental po=new Rental();
    vq.lc(uj, ue);
    vq.lc(ue, fg);
    vq.lc(fg, uj);
    
}
}
