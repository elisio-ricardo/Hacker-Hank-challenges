import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String line = in.nextLine();

                Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
                Matcher texto  = p.matcher(line);
                if (texto.find()){
                    System.out.println(texto.group(2));
                    do { System.out.println(texto.group(2));
                    } while (texto.find());
                } else {
                    System.out.println("None");
                }
                testCases--;
            }
        }

}