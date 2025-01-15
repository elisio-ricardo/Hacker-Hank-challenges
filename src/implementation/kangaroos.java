package implementation;

public class kangaroos {
    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int k1 = x1 + v1;
        int k2 = x2 + v2;

        for (int i = 0; i < 10000 ; i++) {
            if(k1 == k2){
                return "YES";
            }
            k1 += v1;
            k2 += v2;
        }
        return "NO";
    }
}
