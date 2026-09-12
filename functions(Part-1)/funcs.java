import java.util.*;


public class funcs {
     //syntax....
            // returntype name(datatype arg1, datatype arg1){ //JAVA Always follow (*pass by value concept*)
                    //body
            //     return statement;
            // }

    public static void hello(){
        System.out.println("hellow world!!");
    }
    public static void sum_of_two(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter !st number: ");
        int a = sc.nextInt();

        System.out.print("Enter !st number: ");
        int b = sc.nextInt();


        int sum = a + b;
        System.out.print("Sum = ");
        System.out.println(sum);
       
    }
    public  static void main(String args[]){

        hello();
        sum_of_two();

    }
    
}
