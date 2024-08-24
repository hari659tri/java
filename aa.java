/**
 * aa
 */
// @FunctionalInterface
// interface calulate {

//     void math1(int a,int b);
//     //void execute();
// }


// public class  aa {
 
//     public static void main(String[] args) {
//         calulate  obj=(a,b)->{
//             System.out.println("the sum is the"+(a+b));
//         };
//         obj.math1(50,80);
//     }
    
// }


/**
 * aa
 */
// interface myfun {
//   void exe();
     
// }

// public class aa{
//     public static void main(String[] args) {
        
//       myfun obj=()->{
//         System.out.println("hello functional interface");
//       };
//       obj.exe();
//     }
// }

/**
 * aa
 */
 interface operation{
  public  int cal(int a,int b);
}


 class calc {
 
  public static int add(int a,int b){
    return a+b;
  }
    
  public static int sub(int a,int b){
    return a-b;
  }

  public static int mul(int a,int b){
    return a*b;
  }

}

public class aa{
  public static void main(String[] args) {
    operation obj=calc::add;
    int a=obj.cal(10,20);
    System.out.println(a); 

  }
}