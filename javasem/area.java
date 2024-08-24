// import java.lang.*;
//import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
class shape{
int l=5;
int b=6;

}


class triangle extends shape{
    int area(){
        return (l*b/2);
      }
   
}

public class area {
  public static  void main(String args[]){
    // shape o1=new shape();
    // triangle o=new triangle();
    // System.out.println(o.l);\
    // int a=12;
    // System.out.println("harikesh"+a);
    // out.println(sqrt(25));
    // System.out.println(abs(-6.9));
    // out.println(pow(2,4));
     
   
     try{
      int a=10/0;
     }
    //  catch(ArithmeticException err){
    //   System.out.println("error is"+err.getMessage());
    //  }
     finally{
      System.out.println("error are comes due to the this\n");
     }



  }
    
} 
