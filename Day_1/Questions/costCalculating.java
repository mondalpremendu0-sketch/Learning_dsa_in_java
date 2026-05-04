import java.util.*;
public class costCalculating{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the price of pencile: ");
    float pencile = sc.nextFloat();
    System.out.print("Enter the price of pen: ");
    float pen = sc.nextFloat();
    System.out.print("Enter the price of eraser: ");
    float eraser = sc.nextFloat();
    
    float totalCost = pencile+pen+eraser;
    float withGST = totalCost + (totalCost * 0.18f);
    System.out.println("Total bill: "+totalCost+"\nThe total bill with GST: "+withGST);
  }
}