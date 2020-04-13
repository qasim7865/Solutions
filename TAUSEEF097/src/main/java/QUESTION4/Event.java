package QUESTION4;
import java.util.Scanner;
public class Event {
    
public final static int ppg=35;
public final static int cf=50;
private String evn;
private int nog;
private int price;

    public Event(String evn, int nog) {
        this.evn = evn;
        this.nog = nog;
    }

    public Event() {
        this.evn="A000";
        this.nog=0;
    }
    public void setEvn(String evn) {
        this.evn = evn;
    }
    public void setNog(int nog) {
       this.nog = nog;
       this.price=35*nog;
    }
    public String getEvn() {
        return evn;
    }

    public int getNog() {
        return nog;
    }

    public int getPrice() {
        return price;
    }
}
