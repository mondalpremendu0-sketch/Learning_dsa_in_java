
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

    //Print SubArray.......
    public static void Print_SubArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int nums[] = { 2, 4, 6, 8, 10 };
        //Pairs(nums);
        Print_SubArray(nums);

    }

}
