
public class reverse_and_largeNum {

    public static void show_marks(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int arr[]) {

        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array is===========");

    }

    public static int largest_in_array(int arr[]) {
       
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {

        int numbrs[] = { 32, 54, 6, 3, 2, 1 };
        show_marks(numbrs);
        System.out.println();
        reverse(numbrs);
        show_marks(numbrs);
        System.out.println();

        // largest NUMBER---- --

        System.out.println("THE Largest Element IS: " + largest_in_array(numbrs));

    }

}
