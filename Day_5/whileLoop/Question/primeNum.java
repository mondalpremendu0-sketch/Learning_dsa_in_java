import java.util.*;
public class primeNum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    
    boolean flag = false;
    for (int i = 2; i <= n-1 ; i++) {
      if (n % i == 0) {
        flag = true;
        break;
      }
    }
    
    if(flag == false)System.out.println(n+"is a prime number");
    else System.out.println(n+"is a not prime number");
  }
}