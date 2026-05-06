import java.util.*;
public class largestOfThree{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter 1st number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int b = sc.nextInt();
    System.out.print("Enter 3rd number: ");
    int c = sc.nextInt();
    
    if (a > b) {
      if(a > c )System.out.print(a+" is greater.");
    }
    if (b > a) {
      if(b > c )System.out.print(b+" is greater.");
    }
    if (c > a) {
      if(a < c )System.out.print(c+" is greater.");
    }
  }
}