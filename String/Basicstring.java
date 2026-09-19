import java.util.*;

public class Basicstring {

    public static void main(String[] args) {
        // There are three methods to declear a String....
        // char ch[] = {'a','p','p','l','e'};
        // System.out.println(ch[1]);

        // String str = "apple";
        // System.out.println(str);

        // String str1 = new String("xyz");
        // System.out.println(str1);

        // String inputs.......
        Scanner sc = new Scanner(System.in);

        // String name = sc.next();//Only One Word..
        // System.out.println(name);tony

        // String name1 = sc.nextLine();//Whole Sentence...
        // System.out.println(name1);

        // String Length function........
        // System.out.println(name1.length());

        // String Concatination.....
        // String str1 = "Hellow";
        // String str2 = "World";
        // System.out.println(str1 + " " + str2);

        // String chatAt()------------> ***
        String Str = "Hi, I am Prem.";
        System.out.println(Str.charAt(4));
        int i = 0;
        while (i < Str.length()) {
            System.out.print(Str.charAt(i));
            i++;
        }

    }
}
