package DataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetContarPalavras {
    public static void main(String[] args) {
        // You are given  pairs of strings. Two pairs  and  are identical if  and .
        // That also implies  is not same as . After taking each pair as input, you need to print number of unique pairs you currently have.

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Set palavras = new HashSet();
        scanner.nextLine();

        while(scanner.hasNext()){
            String word = scanner.nextLine();
            // System.out.println(word);
            palavras.add(word);
            System.out.println(palavras.size());
        }

    }

}
