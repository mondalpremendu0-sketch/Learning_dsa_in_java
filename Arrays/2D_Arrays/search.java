public class search {
    // Linear search ----------> O(n^2)
    public static void Lsearch(int arr[][], int key) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key) {
                    System.out.print("Found At index (" + i + "," + j + ")");
                }
            }

        }
    }

    // Stair search------------------> O(n)
    public static void Staircase_Search(int arr[][], int key) {
        int row = 0, col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.print("(" + row + "," + col + ")");
                break;
            } else if (key < arr[row][col]) {
                col--;
            } else {
                row++;
            }

        }

    }

    public static void main(String[] args) {
        int matrix[][] = {

                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        // Lsearch(matrix, 14);
        Staircase_Search(matrix, 14);
    }
}
