import java.util.*;

public class linear_search {

    public static void input_marks(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + " Element: ");
            arr[i] = sc.nextInt();
        }

    }

    public static void show_marks(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Element: " + i + " = " + arr[i]);
        }

    }

    public static int linear_searching(int arr[], int key){
        int idx = 0;
         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                idx = i;
            }
        }
        return  idx;
    }
    public static void main(String[] args) {

        int marks[] = new int[5];
        input_marks(marks);
        show_marks(marks);

        int key = 90;
        System.out.println("The Targetted index = " + linear_searching(marks,key));
    }

}
