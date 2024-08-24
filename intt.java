import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class intt{

    public static void main(String[] args) {
        LinkedList<Integer>arr=new LinkedList<>(); // zero size array 
       // System.out.println(arr.size());
        arr.add(20);
        arr.add(40);
        arr.add(60);
        arr.add(80);
        arr.add(100);
        
      System.out.println(arr.peek());
        
      for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i));
      }

    //   for(int i:arr){
    //     System.out.println(i);
    //   }


    }

}