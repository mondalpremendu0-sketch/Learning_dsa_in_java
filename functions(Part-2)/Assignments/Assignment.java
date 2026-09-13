import java.util.*;

public class Assignment {

    public static void average_of_Three(int a,int b,int c) {
        
        float avg = (a + b + c) / 3;

        System.out.println("Avaarege of " + a + b + c + " = " + avg);

    }

    public static void Palindrome_check(int n) {
        
        int original = n;
        int rev = 0;

        while (n > 0) {

            int rem = n % 10;
            rev = rev + rem * 10;
            n /= 10;
        }

        if (rev == original) {
            System.out.println(original + " is a Palindrome Number!✅");
        } else {
            System.out.println(original + " is not a Palindrome Number!❌");

        }

    }

    public static boolean isEven(int n){
        if (n % 2 == 0) {
            return true;
        }else return false;
    }


    public static void main(String[] args) {

        // Question 1 : Write a Java method to compute the average of three numbers...
         Scanner sc = new Scanner(System.in);

        // System.out.print("enter your 1st number: ");
        // int a = sc.nextInt();

        // System.out.print("enter your 2nd number: ");
        // int b = sc.nextInt();

        // System.out.print("enter your 3rd number: ");
        // int c = sc.nextInt();
        // average_of_Three(a,b,c);



        // Write a Java program to check if a number is a palindrome in Java? ( 121 is
        // a palindrome, 321 is not)

        System.out.print("enter your 1st number: ");
        int n = sc.nextInt();

        Palindrome_check(n);

        // Write a method named isEven that accepts an int argument. The method 
        // should return true if the argument is even, or false otherwise. Also write a program to test 
        // your method.
       // isEven();

    }

}
