
public class BasicSorting {

    // Bubble Short-------O(n^2)
    public static void BubbleShort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }

    // selection Short-------O(n^2)
    public static void selectionShort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i <= n - 1; i++) {
            int min = i; // int nums[] = { 5, 4, 1, 3, 2 };
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;

            }
        }

    }

    // Insertation short-------O(n^2)
    public static void InsertattionShort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct position..
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // insertation...
            arr[prev + 1] = curr;
        }
    }

    public static void PrintArray(int arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

    }

    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        // BubbleShort(nums);
        // selectionShort(nums);
        InsertattionShort(nums);
        PrintArray(nums);
    }
}
