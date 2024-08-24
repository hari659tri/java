import java.io.*;
import java.util.ArrayList;
public class file{

public static void main(String[] args) {
    
    // File myfile=new File("a.txt");

    // try{
    //     myfile.createNewFile();
    // }
    // catch(Exception e){
    //     System.out.println(e.getMessage());
    // }

    // try{
    //     FileWriter fileWriter=new FileWriter("a.txt");
    //     fileWriter.write("hello harikesh tripathi how are you\n we are fine");
    //     fileWriter.close();
    // }
    // catch(IOException e){
    //  e.printStackTrace();
    // }

    try{
        File f=new File("hello.txt");
         f.createNewFile();
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    }
   
    // File f=new File("hello.txt");
    // f.delete();
    int v=0;
try{
    FileReader f=new FileReader("hello.txt");
    int i;
    ArrayList<String> s=new ArrayList<>();
    while((i=f.read())!=-1){
      s.add((char)i);
        
    }
    f.close();
    System.out.println(s.size());
}
   catch(IOException e){
    System.out.println(e.getMessage());
   }

}
}