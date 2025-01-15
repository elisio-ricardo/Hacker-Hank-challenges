package DataStructures;
import java.util.*;

/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue,
for which elements can be added to or removed from either the front (head) or back (tail).
Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes.
For example, deque can be declared as:
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
 */

public class LinkedListMaxUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        Map<Integer, Integer> frequencia = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Adicionar elemento atual à janela
            deque.addLast(num);
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);

            // Se a janela ultrapassar o tamanho m, remover o elemento mais antigo
            if (deque.size() > m) {
                int removido = deque.removeFirst();
                frequencia.put(removido, frequencia.get(removido) - 1);
                if (frequencia.get(removido) == 0) {
                    frequencia.remove(removido);
                }
            }
            // Atualizar o máximo de elementos únicos
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, frequencia.size());
            }
        }

        System.out.println(maxUnique);
    }
}

