import java.util.*;

public class CH5_LoopingConstructs{
        
   public static void main(String argv[]){
      /*1.
      int i = 5;
      while((i = 12)!=5) {}//(=12) return 12, then it's compared to 5
      while(i < j) {} //Works
      while(i) {} //Not C++ this will not work!
      while(i = 5) {} //Not work, expression returns 5*/
      
      //2
      int arr[] = {1,2,3,4,5};
      for(int n : arr) { System.out.println(n); }
      //for(int n : arr[]) { System.out.println(n); }//fail
      //for(int n=1; n < 6; n++) { System.out.println(arr[n]); } //fail 
      //for(int n=1; n <= 5; n++) { System.out.println(arr[n]); }//fail
      
      /*int i = 0; do {
      System.out.println(i++);
      } while (i < 5);*/
      
     /* int i = 0; do
      System.out.println(i++);
      while (i < 5);
      
      /*int i = 0; do
      System.out.println(i++);
      while i < 5;
      
      /*int i = 0;
      do
      System.out.println(i);
      i++;
      while (i < 5);*/
      
      //4. 
      /*ArrayList<String> list = new ArrayList();
      list.add("A");
      list.add("B");
      list.add("C");
      
      for(String n : list) 
      { System.out.println(n);
      
      for(int n = 0; n < list.size(); n++ )
      { System.out.println(list.get(n));
      
      Iterator it = list.iterator(); while(it.hasNext()) 
      {
      
      //5
      int i;
   }
}