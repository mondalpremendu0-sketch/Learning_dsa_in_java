import java.util.*;


public class Pattrens {
    public static void main(String[] args) {
       //Square Pattren--

       System.out.print("Enter a Positive Number: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for (int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++){

            System.out.print(
                '*'
            );

        }
        System.out.println();        
       }


       //Right_Angle Triangle---

       for (int i = 0; i < n; i++) {
        for(int j = 0; j <= i; j++){

            System.out.print(
                '*'
            );

        }
        System.out.println();        
       }


       //inverted Triangle-----

            for (int i = 0; i < n; i++) {
        for(int j = n-i; j > 0; j--){

            System.out.print(
                '*'
            );

        }
        System.out.println();        
       }

    }
}