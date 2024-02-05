package OPPS_prac;
import java.util.*;
public class inharitancedamo {
    /*  in java inharitance four types  in inharitance extends key word is used for inharite the poperty of other class
    1. single inharitance
    2. Multilevel inharitance
    3. Hirarchical inharitance
    4. Hybrid inharitance
    */
    public static void main(String[] args) {
        C obj=new C();
        obj.e();
        obj.demo();
        obj.d();
        D ob= new D();
        ob.m();
        ob.demo();
        ob.d();
        /* 
        //SINGLE INHARITANCE
        B obj=new B();
        obj.demo();
        obj.d();
         */
    }
}
class A{
    public void demo(){
        System.out.println("Hallo this is class A");
    }
}
class B extends A{ //This is Single inharitance because hear only one class is inharite by other class
    public void d(){
        System.out.println("This is calass B");
    }
}
class C extends B{ //Multilevle inhartance 
    public  void e(){
        System.out.println("This is class C");
    }

}
class D extends B{
    public void m(){
        System.out.println("This is class D");
    }
}