import java.util.*;
public class oddEven{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enterr a number: ");
    int a = sc.nextInt();
    
    if (a % 2 == 0) {
      System.out.print(a + "is even number");
    }
    else {
      System.out.print(a + "is odd number");
    }
  }
}