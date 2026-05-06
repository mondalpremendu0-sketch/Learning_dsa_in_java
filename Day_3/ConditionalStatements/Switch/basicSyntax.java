import java.util.*;
public class basicSyntax{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter week number (1-7): ");
    int days = sc.nextInt();
    
    switch(days){
      case 1: 
        System.out.print("MONDAY");
        break;
      case 2: 
        System.out.print("TUESDAY");
        break;
      case 3: 
        System.out.print("WEDNESDAY");
        break;
      case 4: 
        System.out.print("THRUSDAY");
        break;
      case 5: 
        System.out.print("FRIDAY");
        break;
      case 6: 
        System.out.print("SATURDAY");
        break;
      case 7: 
        System.out.print("SUNDAY");
        break;
      default: 
      System.out.print("Wrong input");
    }
  }
}