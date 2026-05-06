import java.util.*;
public class leapYear{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int year = sc.nextInt();
    
    if((year%4 == 0 && year%100 == 0) || year%400 == 0 )System.out.printf("Leap year", year);
    else System.out.printf("Not Leapyear", year);
  }
}