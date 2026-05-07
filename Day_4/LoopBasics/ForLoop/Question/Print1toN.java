import java.util.*;
public class Print1toN{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your n: ");
    int n = sc.nextInt();
    
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }
}