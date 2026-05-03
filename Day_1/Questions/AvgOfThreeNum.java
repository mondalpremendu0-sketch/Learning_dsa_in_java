import java.util.*;
public class AvgOfThreeNum{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    int x1 = sc.nextInt();
    System.out.print("Enter 2nd number: ");
    int x2 = sc.nextInt();
    System.out.print("Enter 3rd number: ");
    int x3 = sc.nextInt();
    float avarage = (x1+x2+x3)/3;
    System.out.println("the avarage of 3 numbers is " + avarage);
  }
}