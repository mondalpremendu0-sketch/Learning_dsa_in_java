import java.util.*;
public class StdGrade{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your marks: ");
    float marks = sc.nextInt();
    
    if (marks > 90) System.out.print("O");
    else if (marks > 80) System.out.print("E");
    else if (marks > 70) System.out.print("A");
   else if (marks > 60) System.out.print("B");
    else if (marks > 50) System.out.print("C");
   else if (marks > 40) System.out.print("D");
    else System.out.print("F");
  }
}