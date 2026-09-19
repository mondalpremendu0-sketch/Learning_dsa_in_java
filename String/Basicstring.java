
public class Basicstring {

    public static boolean searchMatrix(int matrix[][], int target) {

        int n = matrix.length, m = matrix[0].length;
        int start = 0, end = m - 1;
        int row = 0;
        while (row <= n - 1) {
            int mid = (start + end) / 2;
            if (matrix[row][mid] == target)
                return true;
            else if (matrix[row][mid] < target) {
                start = mid + 1;
                mid = start;
            } else {
                end = mid - 1;
                mid = end;
            }
            row++;
        }
        return false;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(matrix, 34));
    }
}
