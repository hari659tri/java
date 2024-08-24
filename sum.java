import java.util.*;
public class sum{
    public static int Sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s= Sum(a, b);
        System.out.println(s);
        sc.close();
        var aa=6;
        System.out.println(aa);
        final int num=8;
     //num=7;  cannot be changed once assingned it a value
        System.out.println(num);
    }
}