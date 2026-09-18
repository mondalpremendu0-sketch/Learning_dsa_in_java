
public class array2D {
    public static void SpiralPrint(int arr[][]) {
        int n = arr.length, m = arr[0].length;

        int sc = 0, ec = m - 1;
        int sr = 0, er = n - 1;
        while (sc <= ec && sr <= er) {
            // top
            for (int j = sc; j <= ec; j++) {
                System.out.print(arr[sr][j] + ", ");

            }
            // right
            for (int i = sr + 1; i <= er; i++) {
                System.out.print(arr[i][ec] + ", ");

            }
            // bottom
            for (int k = ec - 1; k >= sc; k--) {
                System.out.print(arr[er][k] + ", ");
            }
            // left
            for (int l = er - 1; l >= sr + 1; l--) {
                System.out.print(arr[l][sc] + ", ");

            }
            sc++;
            ec--;
            sr++;
            er--;

        }
    }

    public static void main(String[] args) {
        int matrix[][] = {

                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        SpiralPrint(matrix);
    }
}
