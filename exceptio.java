public class exceptio {
    
 class exp extends Exception{
   
    private static int accno[]={1001,1002,1003,1004,1005};
    private static String name[]={"mohan","sohan","rohan","aman","raman"};
    private static int bal[]={1000,1200,20000,900,3400};
    String s;
    exp(String st){
     this.s=st;
    }
    String supe(){
      return s;
    }

    public static void main(String[] args) {
        try{
            System.out.println("display the AccNO----");

            for(int i=0;i<5;i++){
                if(bal[i]<1000){
                    exceptio outer = new exceptio();
                    exp me = outer.new exp("balance is insufficient\n");
                throw me;
            }
        }
    }
        catch(Exception e){
            
           System.out.println(e.getMessage());
        }
    }
 }
}
