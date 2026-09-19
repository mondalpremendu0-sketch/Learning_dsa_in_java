
public class Assignment {
    public static int Count_7(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int Second_row_sum(int arr[][], int row) {
        int sum = 0;
        if (row > arr.length || row <= 0) {
            System.out.println("invalid row!!");
        } else {
            int i = row - 1;
            int j = 0;
            while (j <= arr[0].length - 1) {
                sum += arr[i][j];
                j++;
            }
            return sum;

        }
        return -1;

        // for (int i = row-1; i < row; i++) {
        // for (int j = 0; j < arr[0].length; j++) {
        // sum += arr[i][j];
        // }
        // }

    }

    public static void Transpose_Matrix(int arr[][]) {
        int row = arr.length, col = arr[0].length;

        int trans_matrix[][] = new int[col][row];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trans_matrix[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < trans_matrix.length; i++) {
            for (int j = 0; j < trans_matrix[0].length; j++) {
                System.out.print(trans_matrix[i][j]);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // Question 1 Print the number of 7’s that are
        // in the 2d array. Example :
        // Input - int array = ( (4,7,8},(8,8,7} };
        // Output - 2
        // int matrix[][] = {
        // { 4, 7, 8 }, { 8, 8, 7 }
        // };

        // System.out.println("The No of 7 present is: " + Count_7(matrix, 7));
        // ========================================================================================

        // Question 2 : Print out the sum of the numbers in the second row of the “nums"
        // array.
        // Example :
        // Input - int nums = ( (1,4,9},(11,4,3},{2,2,3} };
        // Output - 18

        // int nums[][] = {
        // { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 }
        // };
        // System.out.println(Second_row_sum(nums, 1));
        // ========================================================================================

        // Question 3 : Write a program to Find Transpose of Matrix
        // What is Transpose? Transpose of a matrix is the process of swapping the rows
        // to columns.
        // For a 2x3 matrix,
        // Matrix
        // a11 a12 a13
        // a21 a22 a23
        // Transposed Matrix
        // a11 a21
        // a12 a22
        // a13 a23

        int matrix[][] = {
                { 4, 7, 8 }, { 8, 8, 7 }
        };
        Transpose_Matrix(matrix);

    }

}
