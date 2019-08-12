import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      if(n/2==0)
      System.out.println("The given number is even " + n);
      if(n/2!=0)
      System.out.println("The given number is odd " + n);
    }
}
