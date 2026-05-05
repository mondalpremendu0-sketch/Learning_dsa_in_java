import java.util.*;
public class largestOfTwo{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enterr a : ");
    int a = sc.nextInt();
    
    System.out.print("Enter b: ");
    int b = sc.nextInt();
    
    if (a > b) {
      System.out.print(a + "is greater");
    }
    else {
      System.out.print(b + "is greater");
    }
  }
}