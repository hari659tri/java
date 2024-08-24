class pen{
    String name;
    String color;

    pen(String name,String color){
      
        this.name=name;
        this.color=color;
    }
}



public class constructor {
    
    public static void main(String args[]){
        pen obj=new pen("linkestar","red");
        System.out.println(obj.color+" "+obj.name);
       
    }
}
