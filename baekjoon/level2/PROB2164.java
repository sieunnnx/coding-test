package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class PROB2164 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int N;
    static Deque<Integer> cards = new ArrayDeque<>();
    static int lastCard;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            cards.addLast(i + 1);
        }

        findLastCard();

        System.out.println(lastCard);
    }

    public static void findLastCard() {
        while (cards.size() > 1) {
            cards.removeFirst();

            int temp = cards.removeFirst();
            cards.addLast(temp);
        }
        lastCard = cards.peek();
    }
}
