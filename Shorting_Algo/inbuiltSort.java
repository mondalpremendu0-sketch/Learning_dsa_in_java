import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort {

    public static void PrintArray(Integer arr[]) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

    }

    public static void main(String[] args) {
        Integer nums[] = { 5, 4, 1, 3, 2 };
        //Arrays.sort(nums,0,3); //O(nlogn)
        Arrays.sort(nums,Collections.reverseOrder());
        PrintArray(nums);
    }
}
