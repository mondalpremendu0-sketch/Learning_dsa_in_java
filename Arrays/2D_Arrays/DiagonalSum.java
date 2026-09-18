public class DiagonalSum {
    // Diagonalsum -----------> O(n^2)
    public static int Diagonal_Sum(int arr[][]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }

            }
            sum += arr[i][n - 1 - i];
        }
        return sum;
    }

    //Optimized Diagonal sum ---------> O(n)
      public static int Opt_Diagonal_Sum(int arr[][]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            //main sum
            sum += arr[i][i];
            sum += arr[i][n - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {

                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        //System.out.println(Diagonal_Sum(matrix));
        System.out.println(Opt_Diagonal_Sum(matrix));
    }
}
