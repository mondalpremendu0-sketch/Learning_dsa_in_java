import java.util.*;
public class AreaOfSquare{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the side of a square: ");
    float side = sc.nextInt();
    float area = side * side;
    System.out.print("Area of the square is " + area);
  }
}
