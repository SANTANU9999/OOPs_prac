package OPPS_prac;
import java.util.*;
public class Abstraction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        motor m=new motor();
        m.nano();
        m.audi();
    }
}
abstract class car{
abstract void nano();
abstract void audi();
} 
class motor extends car{
    void nano(){
        System.out.println("WELL COME TO NANO");
    }
    void audi(){
        System.out.println("WELL COME TO AUDI");
    }
}
