package OPPS_prac;
import java.util.*;
public class interfacedemo {
    public static void main(String[] args) {
        jam j= new jam();
        sum s= new sum();
        um u= new um();
    
        j.ram();
        j.m();
        s.ram();
        u.ram();
    }
}
interface aria{
    public void ram();
}
class sy{
    public void m(){
        System.out.println("This is or");
    }
}
class jam extends sy implements aria{
    public void ram(){
    System.out.println("This ram");
    
}
}
class sum implements aria{
 public void ram(){
    System.out.println("This is Ram");
    
 }
}
class um implements aria{
 public void ram(){
    System.out.println("This only Ram");
 }
}