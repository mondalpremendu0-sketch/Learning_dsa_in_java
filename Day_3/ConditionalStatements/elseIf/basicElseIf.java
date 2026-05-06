import java.util.*;
public class basicElseIf{
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enterr age : ");
    int age = sc.nextInt();
    
    
    if (age == 0){
      System.out.println("Invalid age!");
    }
    else if (age > 18) {
      System.out.print("You are a adult");
    }
    else if (age > 50) {
      System.out.print("You are a sinier citizen");
    }
    else {
      System.out.print("You are child");
    }
  }
}