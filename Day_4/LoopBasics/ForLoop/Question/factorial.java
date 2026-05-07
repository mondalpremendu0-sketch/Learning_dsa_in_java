import java.util.*;
public class factorial{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int i , n ,fact = 1;
    
    System.out.print("Enter a positive number: ");
     n = sc.nextInt();
    
    for (i = 2; i<=n; i++) {
      fact *= i;
    }
    System.out.print("factorial of "+ n + "! = "+fact);
  }
}