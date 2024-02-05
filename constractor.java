package OPPS_prac;
import java.util.*;
public class constractor {
  public static void main(String[] args) {
    // in java constractor is two types 1. normal constractor and 2. parameterized constaractor.
          Demo d= new Demo(4); //parameteraized constractor
         //Demo d= new Demo(); // normal constractor
  } 
  
}
class Demo{
    // when two mathode is same name in a class then it is call methode overloding and if methodes are is constractor then methodes are call constractor overloding
    //Normal constractor
     Demo(){
        System.out.println("This is Normal constractor");
    }
    //Parameterized constractor
     Demo(int r){
        System.out.println("This is parametarized constractor");
    }
}
