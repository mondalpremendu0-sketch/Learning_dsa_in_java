
public class Assigement {
    public static void Bubble_Sort_Deceinding(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void Selection_Sort_Deceinding(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void Insertion_Sort_Deceinding(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;

        }

    }

    public static void Counting_Sort_Deceinding(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = count.length-1; i >= 0 ; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        // Question : use the following sorting algorithms to sort an array in
        // DESCENDING order

        // a. Bubble Sort
        // b. Selection Sort
        // c. Insertion Sort
        // d. Counting Sort

        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // int nums[] = { 5, 3, 6, 7, 8, 1, 9 };
        // Bubble_Sort_Deceinding(nums);
        // Selection_Sort_Deceinding(nums);
        // Insertion_Sort_Deceinding(nums);
        Counting_Sort_Deceinding(nums);
        PrintArray(nums);
    }

}
