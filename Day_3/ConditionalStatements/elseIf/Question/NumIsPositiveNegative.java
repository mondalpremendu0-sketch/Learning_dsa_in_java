import java.util.*;
public class NumIsPositiveNegative{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    
    if (num == 0) System.out.print("It s a positive number.");
    else if(num > 0)System.out.print("its a positive number greater than 0");
    else System.out.print("Its a negative number");
  }
}