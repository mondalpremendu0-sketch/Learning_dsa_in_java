import java.util.*;
public class DiviBy5And3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    
    if (num%5 == 0 && num%3 == 0) 
      System.out.println("Its divisible by 5 and 3");
    else
      System.out.println("Its not divisible by 5 and 3");
    
  }
}