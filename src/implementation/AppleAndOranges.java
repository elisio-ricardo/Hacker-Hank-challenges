package implementation;

import java.util.List;

public class AppleAndOranges {

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        Integer totalapples = 0;
        Integer totalOranges = 0;
        Integer var = 0;

        for (Integer apple : apples) {
            var = apple + a ;
            if(var >= s && var <= t) {
                totalapples++;
            }
        }
        var = 0;

        for (Integer orange : oranges) {
            var = orange + b ;
            if(var <= t && var >= s ) {
                totalOranges++;
            }
        }
        System.out.println(totalapples);

        System.out.println(totalOranges);


    }
}
