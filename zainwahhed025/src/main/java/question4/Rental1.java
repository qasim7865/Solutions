package question4;
public class Rental1 {
    public static void main(String[] args){
        Rental a=new Rental();
        String df=a.input1();
        int hc=a.input();
        Rental j=new Rental(df,hc);
        j.disp();
    }
}
