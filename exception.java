 import java.io.*;
public class exception {
    
    public static void main(String[] args){
    //   int a=9/3;
    //   System.out.println(a);
    //  try{
    //     int b=10/0;
    //     System.out.println(b);
    //   }
    //   catch(ArithmeticException err){
    //        System.out.println(err.getMessage());
    //   }
    //   finally{
    //     System.out.println("this is the finally block always executed regardless exception occured or not");
    //   }
    //   int c=4/2;
    //   System.out.println(c);
   
      try{
        FileInputStream file=new FileInputStream("soe.txt");
        //file.close();
      //  System.out.println(file.read());
      }
      catch(FileNotFoundException err){
          System.out.println("file not found exception"+err.getMessage());
      }
    
    }
}
