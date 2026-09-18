public class countingSort {

    public static void CountingSort(int arr[]) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
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
        int nums[] = { 1, 2, 1, 3, 1, 3, 4, 5, 6, 7 };
        CountingSort(nums);
        PrintArray(nums);
    }
}
