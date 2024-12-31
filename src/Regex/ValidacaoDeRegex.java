package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidacaoDeRegex {

    public static void main(String[] args) {
        //In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while(scanner.hasNext()){
            String regex = scanner.nextLine();
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }


}
