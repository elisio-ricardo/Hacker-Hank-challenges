package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpValidation {
    public static void main(String[] args) {
        // IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
        // Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

        Scanner scanner = new Scanner(System.in);
        String ipRegex = "^(([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])$";

        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            //System.out.println(ip);
            if (Pattern.matches(ipRegex, ip)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
