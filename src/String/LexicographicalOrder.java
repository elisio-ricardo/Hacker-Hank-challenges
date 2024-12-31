package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
     //Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows
    //A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
        Scanner scanner = new Scanner(System.in);



        String w = scanner.nextLine();
        int tam = scanner.nextInt();
        int tam2 = tam -1;

        List lista = new ArrayList<>();

        for (int i = 0; i < w.length() - tam2; i++) {
            String word = w.substring(i, i + tam);
            // System.out.println(word);
            lista.add(word);
        }

        Collections.sort(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(lista.size() - 1));
    }
}
