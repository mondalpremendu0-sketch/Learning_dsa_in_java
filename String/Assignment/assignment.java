import java.util.*;

public class assignment {

    public static int countLowerCaseVowel(String str) {
        int count = 0;
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        // Question 1: Count how many times lowercase vowels occurred in a String
        // entered by the user.

        System.out.print("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(countLowerCaseVowel(str));

    }
}
