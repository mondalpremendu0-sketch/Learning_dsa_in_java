
public class arrayCC {

    // Print Pairs....
    public static void Pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }

    }

    // Print SubArray.......
    public static void Print_SubArrays(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    //Sum of SubArray.....
    public static void Sum_of_SubArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println();
                System.out.print("Sum = " + sum);

            }
            System.out.println();
        }
    }

    //Max Sum of subArray.........
    public static void Max_Subarray(int arr[]) {
        int currentSum = 0;
        int MaxSum = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = 0;
                for (int k = i; k <= j; k++) {
                    currentSum += arr[k];
                }
                if (MaxSum < currentSum) {
                    MaxSum = currentSum;
                }
                System.out.print("Sum = " + currentSum);

            }
            System.out.println();
        }
        System.out.println("The Max = " + MaxSum);
    }

    public static void main(String args[]) {

        int nums[] = { 2, 4, 6, 8, 10 };
        // Pairs(nums);
        // Print_SubArrays(nums);
        //Sum_of_SubArray(nums);
        Max_Subarray(nums);
    }

}
