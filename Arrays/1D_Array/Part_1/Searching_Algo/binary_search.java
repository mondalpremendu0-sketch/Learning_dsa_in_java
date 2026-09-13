import java.util.*;

public class binary_search {

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

    public static int binary_searching(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int midIdx = (start + end) / 2;

            if (arr[midIdx] == key) {
                return midIdx;
            } else if (arr[midIdx] > key) {
                end = midIdx - 1;

            } else {
                start = midIdx + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {

        int marks[] = new int[5];
        input_marks(marks);
        show_marks(marks);

        int key = 4;
        if (binary_searching(marks, key) == -1) {
            System.out.println("Element doesnot Exist");

        } else {
            System.out.println("The Targetted index = " + binary_searching(marks, key));

        }
    }

}
