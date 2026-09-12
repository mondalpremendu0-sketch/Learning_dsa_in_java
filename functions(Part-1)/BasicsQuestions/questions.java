import java.util.*;

public class questions {
    // Question 1---------
    public static void product_of_ab() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter !st number: ");
        int a = sc.nextInt();

        System.out.print("Enter !st number: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.print("product = ");
        System.out.println(product);
    }

    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;

    }

    public static void NCR(){
        //nCr = n!/r!*(n-r)!
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (n): ");
        int n = sc.nextInt();

        System.out.print("Enter (r): ");
        int r = sc.nextInt();

        int nCr = Factorial(n)/(Factorial(r) * Factorial(n-r));
        System.out.print("nCr = ");
        System.out.println(nCr);


    }

    public static void main(String[] args) {
        product_of_ab();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (n): ");
        int n = sc.nextInt();

        int fact = Factorial(n);
        System.out.print("factorial = ");
        System.out.println(fact);


        NCR();

    }

}
