class person{
    private String name;
    private int age;
    private int account_number;
  public  void setname(String str){
        this.name=str;
    }
   public void setage(int age){
        this.age=age;
    }
/**
 * this is the best example of the encapsulation used 
 * this is a documentation comment used for the api 
 * and enjoy your coding journey 
 * thank you for doing such strong effort's....
 */
  public  void setaccountno(int account_number){
        this.account_number=account_number;
    }
    // setter is used to set  the private marked value
    // getter is used to get the stted value 
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }

    public int getaccno(){
      return account_number;
    }
}


public class encapsulation {
    public static void main(String[] args) {
    person obj=new person();
    obj.setname("rohan_raj");
    obj.setage(23);
    obj.setaccountno(998000765);
    boolean s=true|false;
    
    System.out.println("Name is"+" "+obj.getname()+" "+obj.getage()+" "+obj.getaccno());
    }
    
   

    
}
