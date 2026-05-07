import java.util.*;
public class tableOfN{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a positive number: ");
    int n = sc.nextInt();
    
    for (int i =1; i <= n ; i++) {
      System.out.println(i + " x " + n + " = " + (i*n));
    }
  }
}