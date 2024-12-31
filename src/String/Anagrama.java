package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {
        //Two strings,  and , are called anagrams if they contain all the same characters in
        //the same frequencies. For this challenge, the test is not
        //case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        char[] letrasA = a.toUpperCase().toCharArray();
        char[] letrasB = b.toUpperCase().toCharArray();

        Arrays.sort(letrasA);
        Arrays.sort(letrasB);

        String palavraOrdenadaA = new String(letrasA);
        String palavraOrdenadaB = new String(letrasB);

        if (palavraOrdenadaA.equals(palavraOrdenadaB)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
