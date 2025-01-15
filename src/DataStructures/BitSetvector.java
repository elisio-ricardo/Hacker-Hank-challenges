package DataStructures;


import java.util.*;

public class BitSetvector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        while (m > 0) {
            String operacao = scanner.next();
            int i1 = scanner.nextInt(), i2 = scanner.nextInt();

            switch (operacao) {
                case "AND":
                    if (i1 == 1) b1.and(i2 == 1 ? b1 : b2);
                    else b2.and(i2 == 1 ? b1 : b2);
                    break;
                case "OR":
                    if (i1 == 1) b1.or(i2 == 1 ? b1 : b2);
                    else b2.or(i2 == 1 ? b1 : b2);
                    break;
                case "XOR":
                    if (i1 == 1) b1.xor(i2 == 1 ? b1 : b2);
                    else b2.xor(i2 == 1 ? b1 : b2);
                    break;
                case "FLIP":
                    if (i1 == 1) b1.flip(i2);
                    else b2.flip(i2);
                    break;
                case "SET":
                    if (i1 == 1) b1.set(i2);
                    else b2.set(i2);
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
            m--;
        }
    }
}
