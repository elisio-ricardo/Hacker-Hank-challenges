package String;

import java.util.Scanner;

public class AlfabetoSplit {
    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);
        String frase = scaneer.nextLine();

        // Divide a string usando uma expressão regular para encontrar caracteres NÃO alfabéticos
        String[] tokens = frase.trim().split("[^a-zA-Z]+");


        if (frase.trim().isEmpty()) {
            System.out.println(0); // Caso a entrada seja vazia, imprime 0 tokens
        } else {

            System.out.println(tokens.length);

            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}
