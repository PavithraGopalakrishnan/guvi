import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String n=s.nextLine();
      String a1="aeiou";
       if(a1.contains(n))
      System.out.print("vowel");
          else
      System.out.print("consonant");
    
    }
}
