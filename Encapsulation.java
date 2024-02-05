package OPPS_prac;
import java.util.*;
public class Encapsulation {
   public static void main(String[] args) {
    bank b= new bank();
    b.setSal((5000000));
    System.out.println("Your Salary Is "+b.getSal());
   } 
}
class bank{
    private int sal;
    public void setSal(int sal){
        this.sal=sal;
    }
    public int getSal(){
        this.sal=sal;
        return sal;
    }
}
