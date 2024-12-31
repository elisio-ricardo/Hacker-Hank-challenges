package String;

import java.util.Scanner;

public class palindrome {

    //Given a string , print Yes if it is a palindrome, print No otherwise.
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reverseWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reverseWord)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
