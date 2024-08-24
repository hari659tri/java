import java.util.*;
public class f {
    public static void main(String[] args) {
        // ArrayList<String>fruits=new ArrayList<>();
        // fruits.add("harikesh");
        // fruits.add("mango");
        // fruits.add("kiwi");
        // fruits.add("banana");
        // fruits.add("apple");

        // fruits.forEach(a->System.out.println(a));
        // String s="hello world";
        // byte[]data=s.getBytes(); // converted the given string into the bytes then we perform the encoding
        // System.out.println(data);
        // String encodeddata=Base64.getEncoder().encodeToString(data);
        // System.out.println(encodeddata);
    //       String day="wed";
         
    //       int dayno=switch(day){
    //         case "mon"->1;
    //         case "tue"->2;
    //         case "wed"->3;
    //         case "thur"->4;
    //         case "fri"->5;
    //         default->0;
    //       };
    //    System.out.println(dayno);

    // used of yield keyword 
   
//     int a=2;
//     int b=3;
//     int c;
//     String option="mul";
//     int sum=switch(option){
//      case "add"->{
//       c=a+b;
//       yield c;
//      }
//      case "sub"->{
//         c=a-b;
//         yield c;
//      }
    
//      case "mul"->{
//         c=a*b;
//         yield c;
//      }
 
//      case "div"->{
//         c=a/b;
//         yield c;
//      }
//      default->-1;

//     };
//  System.out.println(sum);

// String textBlock ="""
//         {
//     "name":"Harikesh Tripathi",
//     "age":20,
//     "Address":"Delhi" // key value pair formated 
// }
//         """;
// System.out.println(textBlock );


/// kiterator 
//  List<String>fruits=new ArrayList<>();
//  fruits.add("mango");
//  fruits.add("Litchi");
//  fruits.add("kiwi");
//  fruits.add("Pinapple");

//  if(fruits.contains("kiwi")){
//     System.out.println("yes kiwi is prsentesd");
//  }

// Object[]s=fruits.toArray();
// System.out.println(s[0]);

//  fruits.forEach(fruit->System.out.println(fruit));  lambad and foreach

//  Iterator<String> f=fruits.iterator();

//  while(f.hasNext()){
//     String el=f.next();
//     System.out.println(el);
//  }
// fruits.set(3, "Luchi");

//   for(int i=0;i<fruits.size();i++){
//     System.out.println(fruits.get(i));
//  ArrayList<Integer>arr=new ArrayList<>();
//  arr.add(90);
//  arr.add(60);
//  arr.add(40);
//  arr.add(-50);
//  arr.add(-60);
//  arr.add(0);
//  //Collections.sort(arr);
//     arr.sort(null);
//         System.out.println(arr);

  
//   LinkedList<String> f=new LinkedList<>();
//   f.add("kiwi");
//   f.add("mango");
//   for(int i=0;i<f.size();i++){
//     System.out.println(f.get(i));
//   }
//   System.out.println(f.size());
//   System.out.println(f.get(0));
//   f.remove(0);
//   System.out.println(f);
//   f.set(0,"banana");
//   System.out.println(f);
//   f.clear();
//   System.out.println(f);

//      int n=5;
//      Vector<Integer>v=new Vector<>();
//      for(int i=1;i<=n;i++){
//      v.add(i);
//      }

//      for(int i=0;i<v.size();i++){
//         System.out.print(v.get(i)+" ");
//      }

//      v.remove(0);
//    System.out.println();
//      for(int i=0;i<v.size();i++){
//         System.out.print(v.get(i)+" ");
//      }

// program to reverse a string using the stack
 
// String st="Harikesh";
// String rev="";
// Stack<Character>stk=new Stack<>();

//  for(int i=0;i<st.length();i++){
//    stk.push(st.charAt(i));
//  } 
  
//  while(stk.empty()){
//    rev=rev+stk.peek();
//    stk.pop();
//  }

//  System.out.println(rev);

 
 /// queue interface
//  Queue<Integer>q=new LinkedList<>();
//  q.offer(50);
//  q.offer(60);
//  q.offer(80);
//  q.offer(100);
//  q.offer(1110);

//  while(q.size()!=0){
//     System.out.print(q.poll()+" ");
//  }
 
// set interface

// HashSet<Integer>s=new HashSet<>();
  
//   s.add(1);
//   s.add(2);
//   s.add(60);
//   s.add(3);
//   s.add(90);
//   s.add(4);
//   s.add(4); // do not allowed duplicate's element's in the Hashset.... // unordered 
  
//   System.out.println(s.contains(4));
//   //s.clear();
//   System.out.println(s);


// LinkedHashSet<Integer>l=new LinkedHashSet<>();
 
//  l.add(90);
//  l.add(100);
//  l.add(200);
//  l.add(300);
//  l.add(400);
//  l.add(400);
//   System.out.println(l);
//   l.remove(300);
//   System.out.println(l);

//  TreeSet<Integer>t=new TreeSet<>();
//  t.add(60);
//  t.add(60);
//  t.add(-2);
//  t.add(100);
//  t.add(200);
//  t.add(500);
// // t.clear();
//  System.out.println(t);


//  SortedSet<Integer>st=new TreeSet<>();
//  st.add(45);
//  st.add(49);
//  st.add(-45);
//  st.add(80);
//  st.add(100);
//  System.out.println(st.first());
//  System.out.println(st.last());
//  System.out.println(st.headSet(200));
//  System.out.println(st.tailSet(45));

//  List<Integer>l=new ArrayList()<>();
//  l.add(45);
 
 // hashmap
//  HashMap<Integer,String> mp=new HashMap<>();
//  mp.put(23,"roni");
//  mp.put(30,"guja");
//  mp.put(98,"pushu");
//  mp.put(23,"moku");
//  System.out.println(mp.size());
// System.out.println(mp.get(23));
// mp.remove(30);
// System.out.println(mp.isEmpty());

 TreeMap<Integer,String>t=new TreeMap<>();
 t.put(30,"cat");
 t.put(40,"apple");
 t.put(90,"bag");
 t.put(56,"cchu");
 t.put(-3,"kjuhj");
 System.out.print(t.get(30));
 System.out.println();
 //System.out.println(t.getvalue());
 //when we have a need to store/retrive the value according to key sorted ordering then used it 





  }

    }



