
public class Solution {
    // Palindrome...
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // Shortest Path from origin.......
    public static float Shortest_Path(String path) {
        int x = 0, y = 0;
        int i = 0;
        while (i <= path.length() - 1) {
            if (path.charAt(i) == 'W')
                x--;
            else if (path.charAt(i) == 'N')
                y++;
            else if (path.charAt(i) == 'E')
                x++;
            else if (path.charAt(i) == 'S')
                y--;
            else
                return -1;

            i++;

        }

        int X2 = x * x;
        int Y2 = y * y;

        return (float) Math.sqrt(X2 + Y2);
    }

    // Substring Print in Given String......
    public static String subStrings(String str, int si, int ei) {
        String newString = "";

        if (ei > str.length() || si < 0) {
            return "Invalid Index";
        }

        for (int i = si; i < ei; i++) {
            newString += str.charAt(i);
        }

        return newString;

    }

    public static void main(String[] args) {

        // String str = "Prem";
        // System.out.println(isPalindrome(str));
        // =================================================

        // String path = "WNEEESENNNN";
        // String path = "NS";
        // System.out.println(Shortest_Path(path));
        // =================================================

        // String str = "HelloWorld";
        // System.out.println(subStrings(str, 0, 7));
        // =================================================

        

    }

}
