import java.util.*;
import java.lang.Math;

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

    // Question 2---------
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        return fact;

    }

    // Question 3---------
    public static void NCR() {
        // nCr = n!/r!*(n-r)!
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (n): ");
        int n = sc.nextInt();

        System.out.print("Enter (r): ");
        int r = sc.nextInt();

        int nCr = Factorial(n) / (Factorial(r) * Factorial(n - r));
        System.out.print("nCr = ");
        System.out.println(nCr);

    }

    // Question 4---------
    public static void prime_check() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter (n): ");
        int n = sc.nextInt();

        boolean flag = false;

        if (n < 2) {
            System.out.println("Its a PRIME Number!");
            return;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
            }

        }

        if (flag) {
            System.out.println("Its a Prime Number");
        } else {
            System.out.println("Its a PRIME Number!");
        }

    }

    // Question 5---------
    public static void prime_in_range() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st range: ");
        int start = sc.nextInt();

        System.out.print("Enter 2nd range: ");
        int end = sc.nextInt();

        if (start == 0) {
            System.out.println("0 is neither Prime nor Composite!");
            return;
        }

        for (int i = start; i <= end; i++) {
            int flag = 0;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.print(i);

            }

        }

    }

    // Question 6---------
    public static void Binary_to_decimal() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Binary Number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int idx = 0;
        while (binary > 0) {
            int rem = binary % 10;
            binary /= 10;
            decimal += rem * Math.pow(2, idx);
            idx++;

        }
        System.out.print("The Converted Decimal Number = ");
        System.out.print(decimal);
    }

    // Question 7---------
    public static void decimal_to_binary() {

        int decimal = 11;
        int binary = 0;
        int idx = 0;

        while (decimal > 0) {
            
            int rem = decimal % 2;
            binary =  binary + rem * (int) Math.pow(10, idx);
            idx++;
            decimal /= 2;
            
        }

        System.out.println(binary);

        

    }

    public static void main(String[] args) {
        // product_of_ab();

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter (n): ");
        // int n = sc.nextInt();

        // int fact = Factorial(n);
        // System.out.print("factorial = ");
        // System.out.println(fact);

        // NCR();
        // prime_check();
        // prime_in_range();
        // Binary_to_decimal();
        decimal_to_binary();

    }

}
