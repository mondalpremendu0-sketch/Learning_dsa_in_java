import java.util.*;//import a packege
public class Input{
  public static void main(String[] args) {
    //input in java with "Scanner" object
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    //for string input without space
    String name = sc.next();
    System.out.println(name);
    
    //for string input with space
    String name = sc.nextLine();
    System.out.println(name);
    
    System.out.print("Enter a nubmer: ");
    //for integer input without space
    int number = sc.nextInt();
    System.out.println(number);
  }
  
}