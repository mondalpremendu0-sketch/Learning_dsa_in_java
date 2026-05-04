public class preIncPostInc{
  public static void main(String[] args) {
    //Pre increment =>> 1st update then use
    int a = 10;
    System.out.println(a);
    int b = ++a;
    System.out.println(b);
    System.out.println(a);
    
    //Pre decrement =>> 1st update then use
    int c = --a;
    System.out.println(c);
    System.out.println(a);
    
    //Post increment =>> 1st use then update
    int d = a++;
    System.out.println(d);
    System.out.println(a);
    
    //Post decrement =>> 1st use then update
    int e = a--;
    System.out.println(e);
    System.out.println(a);
  }
}