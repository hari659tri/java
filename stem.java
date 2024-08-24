import java.util.ArrayList;
import java.util.stream.Stream;

public class stem{
    
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(23);
        arr.add(37);
        arr.add(49);
        arr.add(-47);
        Stream<Integer>data=arr.stream(); // creating a stream from list 
        // data is a stream type 
         // intermediate operation 
         // using filter
        // Stream<Integer>filterdata=data.filter(n->n%2!=0);
        // //terminal operation 
        // filterdata.forEach(n->System.out.println(n));
        
        // using map 
        // Stream<Integer>mp=data.map(n->n*2);
        // mp.forEach(n->System.out.println(n));
      
         // using sorted
        //  Stream<Integer>s=data.sorted();
        //  s.forEach(n->System.out.println(n));
         
         long  k=data.count();
         System.out.println(k);

        }
}
