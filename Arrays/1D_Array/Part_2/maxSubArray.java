public class maxSubArray {
    // Max Sum of subArray.........O(n^3)
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
                System.out.print("Sum = " + currentSum + " ");

            }
            System.out.println();
        }
        System.out.println("The Max = " + MaxSum);
    }

    // Max Sum of subArray(PrefixSum).........O(n^2)
    public static int PrefixSum(int arr[]) {
        int currSum = 0;
        int MaxSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                // currsum += prefixSum[end] - prefixsum[start-1]
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
            }
            if (MaxSum < currSum) {
                MaxSum = currSum;
            }

        }
        return MaxSum;

    }

    
    // Max Sum of subArray(kadans).........O(n)
    public static int kadanas(int arr[]) {
        int currSum = 0;
        int MaxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum > MaxSum) {
                MaxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return MaxSum;

    }

    public static void main(String[] args) {
        int nums[] = { 2, 4, 6, 8, 10 };
        // Max_Subarray(nums);
        //System.out.println(PrefixSum(nums));
        System.out.println(kadanas(nums));

    }
}
