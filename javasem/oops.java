class car{
    // blue print of class blue print created 
    String color;
    String type;

    public void write(){
        System.out.println("print something");
    }
    public void print(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}


public class oops {
    public static void main(String []args){
   
  car pen=new car(); // car object cereated 
  pen.color="blue";
  pen.type="dot";
   pen.print();
  
   car c=new car();
   c.type="marut 800 hundred";
   c.color="blue";
   c.print();
}
}
