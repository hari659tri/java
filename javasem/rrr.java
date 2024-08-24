class test{
    public static int sum(int x,int y){
        return x+y;
    }
}

  /// static member's....
public class rrr {
    
    public static void main(String []args){
    // int s=test.sum(90, 90);
    // System.out.println(s);
    
//     String str="hello";
//     String st="hello";
//     boolean iseq=str.equals(st);
//     if(iseq)
//      System.out.println("this is equal to st");
//     else
//     System.out.println("not equal");
//     //  String sub=str.substring(0,5);
// //     System.out.println(sub);
// //     int indx=str.indexOf('l');
// //     System.out.println(indx);
// //     System.out.println(str.toUpperCase());
// //     System.out.println(str.toLowerCase());
// // 
// System.out.println(iseq);
// String str="helloji";
// String st="HelloJi";
// boolean b=str.equalsIgnoreCase(st);
// System.out.println(b);

    String str="one,two,three,four";
    String []s=str.split(",");
    int d=s.length;
    System.out.println(d);
   
     for(int i=0;i<d;i++){
        System.out.println(s[i]);
     }


}
}
